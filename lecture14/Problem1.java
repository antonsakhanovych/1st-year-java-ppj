import java.util.Scanner;

public class Problem1 {
    static int power(int number, int pow){
        if (pow == 0) return 1;
        return number * power(number, pow-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        System.out.println("Enter power: ");
        int pow = scan.nextInt();
        System.out.println("Result: ");
        System.out.println(power(num, pow));
    }
}
