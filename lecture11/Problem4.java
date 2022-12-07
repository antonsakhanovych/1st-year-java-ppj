// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3, 4, 5};
        int fe = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = fe;
        System.out.println(Arrays.toString(arr));
    }
}
