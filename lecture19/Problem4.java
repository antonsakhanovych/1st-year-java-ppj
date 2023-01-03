public class Problem4 {
    public static void main(String[] args) {
        System.out.println("2 raise to the power of 2 is: " + pow(2,2));
        System.out.println("5 raised to the power of 0 is: " + pow(5, 0));
    }
    static int pow(int a, int to){
        if (to == 0) return 1;
        return a * pow(a, to - 1);
    }
}
