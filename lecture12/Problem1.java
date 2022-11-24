//Author: Anton Sakhanovych
//ESKA: s26776

import java.util.Arrays;

public class Problem1 {
    static int[] generate(int x, int to){
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*to);
        }
        return arr;
    }
    static int getIndEven(int[] arr, boolean forward) {
        int from = 0;
        int to = arr.length-1;
        if (!forward) {
             from = to ^ from ^ (to = from);
        }
        while (from!=to){
            if (arr[from] % 2 == 0) {
                return from;
            }
            if(from < to){
                from++;
            } else {
                from--;
            }
        }
        return -1;
    }


    static int diffEvenInd(int[] arr){
        int indFirstEven = getIndEven(arr, true);
        int indLastEven = getIndEven(arr, false);
        if (indFirstEven != -1 && indLastEven != -1){
            return indLastEven - indFirstEven;
        } else return -1;

    }
    public static void main(String[] args) {
        int[] arr = generate(5, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(diffEvenInd(arr));
        System.out.println(Arrays.toString(arr));
    }
}
