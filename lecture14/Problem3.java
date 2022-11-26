import java.util.Scanner;

public class Problem3 {
    static int gcd(int m, int n){
        int remainder = Math.max(m, n) % Math.min(m, n);
        if (remainder == 0) return Math.min(m, n);
        return gcd(Math.min(m,n), remainder);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number2: ");
        int num2 = scan.nextInt();
        System.out.println("Result: ");
        System.out.println(gcd(num1,num2));
    }
}
