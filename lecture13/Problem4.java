import java.util.Arrays;

public class Problem4 {

    static void printArr(int[][] arr, String title){
        System.out.println(title);
        for(int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
    }

    static void setZeros(int[][] arr){
        int firstLength = arr.length;
        int secondLength = arr[0].length;
        int[][] copyArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i].clone();
        }
        for (int i = 0; i < firstLength; i++) {
            for (int j = 0; j < secondLength; j++) {
                if(arr[i][j] == 0 && arr[i][j] == copyArr[i][j]){
                    for (int k = 0; k < secondLength; k++) {
                        arr[i][k] = 0;
                    }
                    for (int k = 0; k < firstLength; k++) {
                        arr[k][j] = 0;
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        int[][] arr = {{  4,  9, 10,  0,  1,  2 },
                {  7, -8, 20,  1,  5,  8 },
                {  1,  8,  3,  2,  1, -3 },
                {1,  8, -3,  2, 11, -3 },
                { 17,  0,  5, -9, 21, 10 }};
        printArr(arr, "Original");
        setZeros(arr);
        printArr(arr, "Modified");
    }
}
