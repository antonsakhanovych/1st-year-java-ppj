// Author: Anton Sakanovych
// ESKA: s26776

public class Problem2 {

    static void printMatrix(int[][] arr){
        for(int[] el : arr){
            for(int num : el){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void rotateMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length/2; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = tmp;
            }
        }

    }
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3, 4},{5, 6, 7, 8},{9, 7, 5, 3},{8, 6, 4, 2} };
        int[][] b = { {1, 2, 3, 4, 5},{5, 6, 7, 8, 9},{9, 7, 5, 3, 1},{8, 6, 4, 2, 0},{0, 4, 6, 4, 0} };
        System.out.println("Original matrix:");
        printMatrix(b);

        rotateMatrix(b);
        System.out.println("Transposed matrix:");
        printMatrix(b);

    }
}
