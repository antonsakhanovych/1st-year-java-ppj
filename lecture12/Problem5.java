//Author: Anton Sakhanovych
//ESKA: s26776
import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
	int[][][] opers = {
	    { {100, -50, 25}, {150,-300}, {300,-90,100} },
	    { {90, -60, 250}, {300,20,-100} },
	    { {20, 50}, {300}, {20,-20,40}, {100,-200} }
	};

	int length = opers.length;

	int[] sums = new int[length];

	for (int i = 0; i < length; i++) {
	    int sum = 0;
	    for (int j = 0; j < opers[i].length; j++) {
		for (int k = 0; k < opers[i][j].length; k++){
		    sum += opers[i][j][k];
		}
	    }
	    sums[i] = sum;
	}
	System.out.println("Result: " + Arrays.toString(sums));
	
    }

}
