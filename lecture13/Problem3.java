// Author: Anton Sakhanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem3 {

    static void calcGreatInd(int[][] arr){
        int indLine = 0;
        int prevSumLine = 0;
        int indColumn = 0;
        int prevSumColumn = 0;

        int firstLength = arr.length;
        int secondLength = arr[0].length;

        for (int i = 0; i < firstLength; i++) {
            int sumLine = 0;
            for (int j = 0; j < secondLength; j++) {

                if(i == 0) {
                    int sumColumn = 0;
                    for (int[] ints : arr) {
                        sumColumn += ints[j];
                    }
                    if (sumColumn > prevSumColumn){
                        indColumn = j;
                        prevSumColumn = sumColumn;
                    }
                }
                sumLine += arr[i][j];

            }
            if (sumLine > prevSumLine){
                indLine = i;
                prevSumLine = sumLine;
            }

        }
        System.out.println("Index of line with greatest sum: " + indLine);
        System.out.println("Index of column with greatest sum: " + indColumn);


    }

    public static void main(String[] args) {
        int[][] arr = { {1,3,2},
                        {3,4,8},
                        {2,6,8},
                        {1,8,5} };
        for (int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
        calcGreatInd(arr);

    }
}
