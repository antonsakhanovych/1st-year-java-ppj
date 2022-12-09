// Author: Anton Sakanovych
// ESKA: s26776

public class Fruit {
    String name;
    double weight;
    public Fruit(String name){
        this.name = name;
        this.weight = 0.5 + Math.random() * (0.8 -0.5);
    }
    public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);
    }
}
