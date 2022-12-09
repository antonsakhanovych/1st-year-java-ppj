// Author: Anton Sakanovych
// ESKA: s26776

public class Problem2 {
    public static void main(String[] args) {
        Donkey d1 = new Donkey(23);
        boolean flying = false;
        while (!flying){
            d1.addBaloon(new Baloon());
            flying = d1.isFlying();
        }
        System.out.println("I am Flying!");
        System.out.println("It took " + d1.getAmountBaloons() + " for donkey to fly!");
    }
}
