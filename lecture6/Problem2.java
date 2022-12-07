// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class Problem2 {

    public static boolean compare(int oper, int lowerb, int upperb) {
        return (oper >= lowerb && oper <= upperb);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = 2;
        int a2 = 4;
        int b1 = 1;
        int b2 = 6;
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        boolean a = compare(num, a1, a2);
        boolean b = compare(num, b1, b2);
        System.out.println("x in A: " + a);
        System.out.println("x in B: " + b);
        System.out.println("x in A/B: " + (a && !b));
        System.out.println("x in B/A: " + (b && !a));
        System.out.println("x in A^B: " + (a && b));
        System.out.println("x in AUB: " + (a || b));
        System.out.println("x in A0B: " + (a^b));
    }
}
