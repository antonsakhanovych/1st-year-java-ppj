//Author: Anton Sakhanovych
//ESKA: s26776

import java.util.Arrays;

public class Problem2 {
    static int[] generate(int x, int to){
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*to);
        }
        return arr;
    }

    static int findIndMaxMin(int[] arr, boolean max){
        int retIndMaxMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max && arr[i]>arr[retIndMaxMin]){
                retIndMaxMin = i;
            } else if (!max && arr[i] < arr[retIndMaxMin]) {
                retIndMaxMin = i;
            }
        }
        return retIndMaxMin;
    }

    static void swapMinMax(int[] arr) {
	int indMin = findIndMaxMin(arr, false);
        int indMax = findIndMaxMin(arr, true);
	arr[indMin] = arr[indMax] ^ arr[indMin] ^ (arr[indMax]= arr[indMin]);
    }

    public static void main(String[] args) {
        int[] arr = generate(5, 10);
        System.out.println(Arrays.toString(arr));
	swapMinMax(arr);
        System.out.println(Arrays.toString(arr));
    }
}
