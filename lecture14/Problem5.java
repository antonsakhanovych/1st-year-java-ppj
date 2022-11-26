import java.util.Arrays;

public class Problem5 {
    static void createCircle(int[][] arr, int sVal){
        if(sVal < arr.length){
	    createCircle(arr, sVal + 1);
	}
	for(int i = sVal - 1; i <= arr.length - sVal; i++){
	    arr[sVal - 1][i] = sVal;
	    arr[arr.length-sVal][i] = sVal;
	    arr[i][sVal-1] = sVal;
	    arr[i][arr.length-sVal] = sVal;
	}
    }
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        createCircle(arr, 1);
        for(int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
    }
}
