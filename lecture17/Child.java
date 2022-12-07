import java.util.Objects;

public class Child {
    public String name;
    public int candies;
    public Child(String name){
        this.name = name;
        this.candies = 2;
    }
    public void givesCandyTo(Child other){
        if (this.candies == 0){
            System.out.println(this.name + " doesn't have any candies left! ;(");
            return;
        }
        this.candies -= 1;
        other.candies +=1;
    }

    static Child getChildByName(Child[] children, String name){
        for(int i = 0; i < children.length; i++){
            if(Objects.equals(children[i].name, name)){
                return children[i];
            }
        }
        return null;
    }

    static void printChildren(Child[] children){
        System.out.println(children.length + " children:");
        System.out.print("[ ");
        for (Child child : children) {
            System.out.print(" (");
            System.out.print(child.name + ", " + child.candies + " candies");
            System.out.print(") ");
        }
        System.out.print(" ]");
    }

}
