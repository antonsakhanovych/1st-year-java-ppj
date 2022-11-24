import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three-digit number: ");
        int num = scan.nextInt();
        int length = Integer.toString(num).length();

        while (length != 3){
            System.out.println("This was not a three-digit number! Enter again!");
            num = scan.nextInt();
            length = Integer.toString(num).length();
        }

        boolean allEven = true;

        for (int i = 0; i < length; i++) {
            int remainder = num % 10;
            if ((remainder % 2) == 0){
                num /= 10;
                continue;
            }
            allEven = false;
            break;
        }

        if(allEven){
            System.out.println("Even digits!");
        } else {
            System.out.println("Mixed digits!");
        }
    }
}
