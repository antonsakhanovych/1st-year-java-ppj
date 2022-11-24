import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int maximum = Math.max(a, b);
        int minimum = Math.min(a, b);
        int num;
        for (int i = 0; i < 2; i++) {
            num = scan.nextInt();
            maximum = Math.max(maximum, num);
            minimum = Math.min(minimum, num );
        }
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        int difference = maximum - minimum;
        System.out.println("Difference: " + difference);
    }
}
