public class Problem3 {
    public static void main(String[] args) {
        boolean test = true;
        System.out.println("Initial value is: " + test);
        while (test){
            System.out.println("While loop! Value is: " + test);
            test = !test;
        }
        test = false;
        System.out.println("Initial value is: " + test);
        do{
            System.out.println("Do while loop! Value is: " + test);
            test = !test;
        }while(test);
    }
}
