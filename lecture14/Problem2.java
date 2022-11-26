import java.util.Scanner;

public class Problem2 {
    static int sum(int sumTotal){
        if (sumTotal == 0) return 0;
        return sumTotal + sum(sumTotal - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        System.out.println("Result: ");
        System.out.println(sum(num));
    }
}
