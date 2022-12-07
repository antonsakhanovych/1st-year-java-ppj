// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte b = scan.nextByte();
        char hex = Integer.toHexString(b).charAt(0);

        System.out.println(hex);
    }
}
