public class Monster extends Character{
    private int expToGive;

    public Monster(int health, int mana, int stamina, Inventory inventory) {
        super(health, mana, stamina, inventory);
        this.expToGive = (int)((Math.random() * 2) + 1);
    }

    public int expToGive(){
        return this.expToGive;
    }

    @Override
    public boolean isAlive(){
        return super.isAlive() && (this.getTotalMana() > 0 || this.getTotalStamina() > 0);
    }
    @Override
    public Weapon chooseWeapon() {
        int numWeapons = this.inventory.getWeapons().getLength();
        int randWeapon = (int)(Math.random() * numWeapons);
        return (Weapon)this.inventory.getWeapons().getItems()[randWeapon];
    }

    public static Monster createRandomMonster(){
        Inventory monstInv = new Inventory();
        monstInv.addItem(Item.createRandomItem());
        monstInv.addItem(Item.createRandomItem());
        monstInv.addItem(Weapon.createRandomWeapon());
        int randHealth = (int)(Math.random() * (4 - 2 + 1)) + 2;
        int randMana = (int)(Math.random() * (4 - 2 + 1)) + 2;
        int randStamina = (int)(Math.random() * (4 - 2 + 1)) + 2;
        return new Monster(randHealth, randMana, randStamina, monstInv);
    }
}
