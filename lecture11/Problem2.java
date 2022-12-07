// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        int min = arr[0];
        int max = 0;
        int indMin = 0;
        int indMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                indMax = i;
            }
            if (arr[i] < min){
                min = arr[i];
                indMin = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(indMin + " " + indMax);
//        arr[indMax] =  arr[indMin] ^ arr[indMax] ^ (arr[indMax] = arr[indMin]);
        arr[indMax] = min;
        arr[indMin] = max;
        System.out.println(Arrays.toString(arr));
    }
}
