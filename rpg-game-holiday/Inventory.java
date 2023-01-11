import java.awt.geom.NoninvertibleTransformException;
import java.util.Scanner;

public class Inventory {
    private ItemBag manaItems = new ItemBag();
    private ItemBag healthItems = new ItemBag();
    private ItemBag staminaItems = new ItemBag();
    private ItemBag weapons = new ItemBag();


    // adds Item to the inventory
    public void addItem(Item item) {
        switch (item.use[0]) {
            case 0:
                this.healthItems.addItem(item);
                break;
            case 1:
                this.manaItems.addItem(item);
                break;
            case 2:
                this.staminaItems.addItem(item);
                break;
            default:
                throw new IllegalArgumentException("Incorrect usage!");
        }
        if (item instanceof Weapon) {
            this.weapons.addItem(item);
        }
    }

    public ItemBag getHealthBag(){
        return this.healthItems;
    }

    public ItemBag getManaBag(){
        return this.manaItems;
    }

    public ItemBag getStaminaBag(){
        return this.staminaItems;
    }

    public ItemBag getWeapons(){
        return this.weapons;
    }

    public void lootItems(Inventory enemyInv){
        ItemBag enemyHealthBag = enemyInv.getHealthBag();
        ItemBag enemyManaBag = enemyInv.getManaBag();
        ItemBag enemyStaminaBag = enemyInv.getStaminaBag();
        ItemBag enemyWeaponBag = enemyInv.getWeapons();
        this.healthItems.addItemsFromItemBag(enemyHealthBag);
        this.manaItems.addItemsFromItemBag(enemyManaBag);
        this.staminaItems.addItemsFromItemBag(enemyStaminaBag);
        this.weapons.addItemsFromItemBag(enemyWeaponBag);
    }

    public void recheckInventory(){
        healthItems.checkBag();
        manaItems.checkBag();
        staminaItems.checkBag();
    }

    protected static void pickItem(Item item1, Item item2, Inventory yourInv){
        Scanner scan = new Scanner(System.in);
        System.out.println("First Item: ");
        item1.show();
        System.out.println();
        System.out.println("Second Item: ");
        item2.show();
        System.out.println();

        int num = 0;
        while(!(num == 1 || num == 2)){

            System.out.println("Choose item(Type 1 or 2)");
            num = scan.nextInt();
        }
        switch (num){
            case 1:
                yourInv.addItem(item1);
                break;
            case 2:
                yourInv.addItem(item2);
                break;
            default:
                System.out.println("Wrong item number!");
        }
    }

    public static Inventory createYourInventory(){

        // create inventory first
        Inventory yourInv = new Inventory();
        // make user pick two items
        for(int i = 0; i < 2; i++){
            Item item1 = Item.createRandomItem();
            Item item2 = Item.createRandomItem();
            pickItem(item1, item2, yourInv);
        }
        // make user pick a weapon
        Weapon weapon1 = Weapon.createRandomWeapon();
        Weapon weapon2 = Weapon.createRandomWeapon();
        pickItem(weapon1, weapon2, yourInv);
        return yourInv;
    }

}
