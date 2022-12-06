// Author: Anton Sakanovych
// ESKA: s26776

public class Problem1 {

    static double[] getAverages(int arr[][] ){
        double[] retVal = new double[arr.length];
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int inEl : arr[i]){
                sum+= inEl;
            }
            retVal[i] = sum / arr[i].length;
        }
        return retVal;
    }

    public static void main(String[] args) {
        int[][] arr ={ {1,3}, {3,4,5,8}, {6,8}, {9} };
        double[] res = getAverages(arr);
        for (double e : res) System.out.print(e + " ");
    }
}
