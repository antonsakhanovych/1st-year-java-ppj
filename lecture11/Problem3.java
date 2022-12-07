// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int length = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < length; j++) {
                if (arr[j] >= i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
