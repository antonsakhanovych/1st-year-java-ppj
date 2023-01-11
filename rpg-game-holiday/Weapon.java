public class Weapon extends Item {

    private final int damage;
    private final boolean typeMagic;

    public Weapon(String name, String what, int howMuch, int damage, boolean isMagic) {
        super(name, what, howMuch);
        this.damage = damage;
        this.typeMagic = isMagic;
    }

    // return the damage of the weapon
    public int damage() {
        return this.damage;
    }

    public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Properties: increases " + statsKeyMap.get(this.use[0]) + " by " + this.use[1]);
        System.out.println("Type: " + (this.typeMagic ? "Magic" : "Physical"));
        System.out.println("Damage: " + this.damage);
    }

    // return true if the weapon is magic
    // magic weapon will drain mana while
    // non-magic weapons will use stamina

    public boolean isMagic() {
        return this.typeMagic;
    }

    public static Weapon createRandomWeapon(){
        String[] randomNames = {"Piercing spear", "Sparking wand", "Rabadon's deathcap"};
        int damage = (int)((Math.random() * 3) + 1);
        boolean isMagic = Math.random() > 0.5;
        int num = (int)(Math.random() * 3);
        int howMuch = (int)((Math.random() * 4) + 1);
        String usage = Item.statsKeyMap.get(num);
        return new Weapon(randomNames[num], usage, howMuch, damage, isMagic);
    }
}
