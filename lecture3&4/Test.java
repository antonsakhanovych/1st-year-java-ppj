import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a>b||c>b) && (b>c||b>a)){
            System.out.println(b);
        } else if((b>a || c>a) && (a>c || a>b)){
            System.out.println(a);
        } else {
            System.out.println(c);
        }

    }
}