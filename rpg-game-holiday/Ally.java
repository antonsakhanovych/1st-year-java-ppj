import java.util.Scanner;

public class Ally extends Character{
    public Ally(int health, int mana, int stamina, Inventory inventory) {
        super(health, mana, stamina, inventory);
    }

    public static Character createRandomAlly(){
        Inventory charInv = new Inventory();
        charInv.addItem(Item.createRandomItem());
        charInv.addItem(Item.createRandomItem());
        charInv.addItem(Weapon.createRandomWeapon());
        int randHealth = (int)(Math.random() * (5 - 2 + 1)) + 2;
        int randMana = (int)(Math.random() * (5 - 2 + 1)) + 2;
        int randStamina = (int)(Math.random() * (5 - 2 + 1)) + 2;
        return new Ally(randHealth, randMana, randStamina, charInv);
    }



}
