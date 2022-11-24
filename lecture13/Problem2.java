// Author: Anton Sakhanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem2 {
    static int[][] trans(int[][] arr){
        int firstLength = arr.length;
        int secondLength =  arr[0].length;
        int[][] retVal = new int[secondLength][firstLength];
        for (int i = 0; i < secondLength; i++) {
            for (int j = 0; j < firstLength; j++) {
                retVal[i][j] = arr[j][i];
            }
        }
        return retVal;
    };
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };
        for(int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
        for(int[] el : trans(arr)){
            System.out.println(Arrays.toString(el));
        }
    }
}
