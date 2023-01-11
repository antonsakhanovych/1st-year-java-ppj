import java.util.HashMap;
import java.util.Scanner;

public abstract class Character {
    protected HashMap<String, Integer> stats = new HashMap<>();
    protected Inventory inventory;

    public Character(int health, int mana, int stamina, Inventory inventory) {
        if (health < 1 || mana < 1 || stamina < 1) {
            throw new IllegalArgumentException("Character is too weak! Please give him more stats!");
        }
        this.stats.put("health", health);
        this.stats.put("mana", mana);
        this.stats.put("stamina", stamina);
        this.inventory = inventory;
    }


    public void showStats() {
        System.out.println("Health: " + this.getTotalHealth());
        System.out.println("Mana: " + this.getTotalMana());
        System.out.println("Stamina: " + this.getTotalStamina());
    }

    protected int getTotalHealth() {
        return this.stats.get("health") + this.inventory.getHealthBag().getStats();
    }

    protected int getTotalMana() {
        return this.stats.get("mana") + this.inventory.getManaBag().getStats();
    }

    protected int getTotalStamina() {
        return this.stats.get("stamina") + this.inventory.getStaminaBag().getStats();
    }

    public boolean isAlive() {
        this.inventory.recheckInventory();
        return this.getTotalHealth() > 0;
    }

    public boolean hasWeapons(){
        this.inventory.recheckInventory();
        return this.inventory.getWeapons().getLength() > 0;
    }

    public Weapon chooseWeapon() {
        // remove broken items
        this.inventory.recheckInventory();
        ItemBag weaponsBag = this.inventory.getWeapons();
        // check if there are no weapons in the inventory
        if(weaponsBag.getItems().length == 0){
            System.out.println("You do not have any weapons left!");
            return null;
        }
        // Take a choice from user
        Scanner scan = new Scanner(System.in);
        weaponsBag.showItems();
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        // make sure the number is valid
        while(num < 0 || num >= weaponsBag.getLength()){
            System.out.println("There are no weapon with this number! Please enter the correct number: ");
            num = scan.nextInt();
        }

        Weapon chosenWeapon = (Weapon) this.inventory.getWeapons().getItems()[num];
        System.out.println("You chose: " + chosenWeapon.name);

        return chosenWeapon;
    }
    public void attack(Weapon weapon, Character enemy){
        // check if weapon is magical
        try {
            if (weapon.isMagic()) {
                this.useMana();

            } else {
                this.useStamina();
            }
        } catch(NotEnoughResources err){
            System.out.println("Not enough resources! Choose another weapon or call for help!");
            return;
        }
        enemy.takeDamage(weapon);
        System.out.println("Damage dealt " + weapon.damage() + " to " + enemy.getClass().getName());
    }

    public void lootEnemy(Character killedEnemy){
        Inventory enemyInv = killedEnemy.inventory;
        this.inventory.lootItems(enemyInv);
    }
    public void useMana() throws NotEnoughResources {
        ItemBag manaBag = this.inventory.getManaBag();
        int yourMana = this.stats.get("mana");
        if(manaBag.getStats() > 0){
            manaBag.takeDamage();
        } else if (yourMana > 0){
            int mana = yourMana - 1;
            this.stats.replace("mana", mana);
        } else {
            throw new NotEnoughResources("You do not have mana! Either choose another type of weapon or call for help!");
        }
    }

    public void useStamina() throws NotEnoughResources {
        ItemBag staminaBag = this.inventory.getStaminaBag();
        int yourStamina = this.stats.get("stamina");
        if(staminaBag.getStats() > 0){
            staminaBag.takeDamage();
        } else if (yourStamina > 0){
            int stamina = yourStamina - 1;
            this.stats.replace("stamina", stamina);
        } else {
            throw new NotEnoughResources("You do not have stamina! Either choose another type of weapon or call for help!");
        }
    }


    public void takeDamage(Weapon weapon) {
        for (int i = 0; i < weapon.damage(); i++) {
            if (this.inventory.getHealthBag().getStats() != 0) {
                // first we use health items
                this.inventory.getHealthBag().takeDamage();
            } else {
                // If there are none character takes damage
                int health = this.stats.get("health") - 1;
                this.stats.replace("health", health);
            }
        }
    }




}
