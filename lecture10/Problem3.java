// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        char[] arr = new char[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(Math.random()*(90-65)+65);
            System.out.print(arr[i]);
        }
        System.out.println();
        int notEnd = 0;
        while (notEnd != 5){
            int count = 0;
            char letter = scan.next().charAt(0);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == letter) {
                    count++;
                    arr[i] = 0;
                    notEnd++;
                }
            }


            System.out.println("Number of repeated letters: " + count);
            System.out.println("Updated array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }

    }
}
