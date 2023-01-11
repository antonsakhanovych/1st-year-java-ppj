import java.util.HashMap;
public class Item {

    protected static final HashMap<Integer, String> statsKeyMap = new HashMap<>();
    static {
        statsKeyMap.put(0, "health");
        statsKeyMap.put(1, "mana");
        statsKeyMap.put(2, "stamina");
    }
    protected final String name;
    protected final int[] use = {0, 0};

    public Item(String name, String what, int howMuch) {
        switch (what) {
            case "health":
                this.use[0] = 0;
                break;
            case "mana":
                this.use[0] = 1;
                break;
            case "stamina":
                this.use[0] = 2;
                break;
            default:
                throw new IllegalArgumentException("Item can only affect: health, mana, or stamina!");
        }
        this.name = name;
        this.use[1] = howMuch;
    }

    public int getStats(){
        return this.use[1];
    }

    public void showName(){
        System.out.println(this.name);
    }
    public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Properties: increases " + statsKeyMap.get(this.use[0]) + " by " + this.use[1]);
    }

    public static Item createRandomItem(){
        String[] randomNames = {"Health Potion", "Enchanted Stone", "Magical Candy"};
        int num = (int)(Math.random() * 3);
        int howMuch = (int)((Math.random() * 4) + 1);
        String usage = Item.statsKeyMap.get(num);
        return new Item(randomNames[num], usage, howMuch);
    }

    // return int[] where use[0] is what stat it will increase
    // 0: health, 1: mana, 2: stamina
    // and use[1] is the amount by which the stat is increased
    // use[2] will save the initial value of use[1]
    // so when we transfer the item from character to character
    // it will restore to its initial stats.
    public int[] use() {
        return this.use;
    }

    public boolean isBroken(){
        return this.use[1] < 1;
    }

    public void takeOneDamage(){
        this.use[1] -= 1;
    }

}
