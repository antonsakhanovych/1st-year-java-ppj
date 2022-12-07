// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a = Boolean.parseBoolean(scan.nextLine());
        boolean b = Boolean.parseBoolean(scan.nextLine());
        boolean c = Boolean.parseBoolean(scan.nextLine());
        boolean[] arr = {a, b, c};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true){
                count++;
            }
        }
        boolean allThree = count == 3;
        boolean exactlyOne = count == 1;
        boolean exactlyTwo = count == 2;
        boolean atLeastOne = count >= 1;
        boolean atLeastTwo = count >= 2;
        System.out.println("allThree: " + allThree);
        System.out.println("exactlyOne: " + exactlyOne);
        System.out.println("exactlyTwo: " + exactlyTwo);
        System.out.println("atLeastOne: " + atLeastOne);
        System.out.println("atLeastTwo: " + atLeastTwo);
        scan.close();
    }
}
