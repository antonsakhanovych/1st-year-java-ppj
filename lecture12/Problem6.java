//Author: Anton Sakhanovych
//ESKA: s26776

import java.util.Arrays;

public class Problem6 {
    
    static int[][] inner(int[][] arr) {
	int length1 = arr.length - 2;
	int length2 = arr[0].length - 2;
	int[][] retVal = new int[length1][length2];
	for (int i = 0; i < length1; i++) {
	    for (int j = 0; j < (length2); j++) {
		retVal[i][j] = arr[i+1][j+1];
	    }
	}
	return retVal;
    }

    public static void main(String[] args) {
	int[][] arr = { { 1, 2, 3, 4, 5, 6 },
			{ 2, 3, 4, 5, 6, 7 },
			{ 3, 4, 5, 6, 7, 8 },
			{ 4, 5, 6, 7, 8, 9 }, };
	
	for (int[] el : arr) {
	    System.out.println(Arrays.toString(el));
	}
	
	System.out.println();
	
	for (int[] el : inner(arr)) {
	    System.out.println(Arrays.toString(el));
	}
    }
}
