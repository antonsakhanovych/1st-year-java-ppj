// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int symSize = 1;
        int repNum = 2 * size + 1;
        boolean reverse = false;
        for (int i = 0; i < repNum; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < symSize; j++) {
                System.out.print("X ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print(". ");
            }
            System.out.println();

            if(symSize == repNum){
                reverse = true;
            }
            if(!reverse){
                size -= 1;
                symSize += 2;
            } else {
                size += 1;
                symSize -= 2;
            }

        }

    }
}
