public class ItemBag {
    protected Item[] items = new Item[0];

    public void addItem(Item item){
        int prevLength = this.items.length;
        Item[] newItems = new Item[prevLength + 1];
        newItems[prevLength] = item;
        if(prevLength != 0){
            System.arraycopy(this.items, 0, newItems, 0, prevLength);
        }
        this.items = newItems;
    }

    public void addItemsFromItemBag(ItemBag itemBag){
        for(Item item : itemBag.getItems()){
            System.out.println("You looted: " + item.name);
            this.addItem(item);
        }
    }

    public void removeItem(Item itemToRem){
        int prevLength = this.items.length;
        Item[] newItems = new Item[prevLength - 1];
        int idx = 0;
        for (Item item : this.items) {
            if (item != itemToRem) {
                newItems[idx] = item;
                idx++;
            }
        }
        this.items = newItems;
    }

    public Item[] getItems(){
        return this.items;
    }

    public int getLength(){
        return this.items.length;
    }

    public void showItems(){
        for(int i = 0; i < this.items.length; i++){
            System.out.println(i + ") ");
            this.items[i].show();
        }
    }

    public int getStats(){
        int result = 0;
        for(Item item : this.items){
            result += item.getStats();
        }
        return result;
    }

    public void checkBag(){
        int length = this.items.length;
        Item[] newItems = new Item[length];
        System.arraycopy( this.items, 0, newItems, 0, length);
        for(Item item : newItems){
            if(item.isBroken()){
                this.removeItem(item);
            }
        }
    }

    public void takeDamage(){
        int length = this.items.length;
        if(length > 0){
            this.items[0].takeOneDamage();
        }
        this.checkBag();
    }

}
