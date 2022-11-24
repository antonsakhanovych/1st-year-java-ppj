import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a + " " + b + " " + c);
        int minimum = Math.min(a, Math.min(b, c));
        int maximum = Math.max(a, Math.max(b, c));
        int middle = a<=minimum && a>=maximum ? a : b<=minimum && b>=maximum ? b : c!=minimum && c!=maximum ? c : 0;
        System.out.println(minimum + " " + middle + " " + maximum);
    }
}
