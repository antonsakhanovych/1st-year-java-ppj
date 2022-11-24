public class Problem4 {
    public static void fillFunction(int[] arr, int max, int min){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max-min)+min);
        }
    }

    public static void displayArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] addElement(int[] arr, int x){
        int size = arr.length + 1;
        int[] newArr = new int[size];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = x;
        return newArr;
    }

    public static int findMaxMin(int[] arr, boolean maxmin){
        int mxmn = 0;
        if (maxmin) {

            for (int j : arr) {
                mxmn = Math.max(j, mxmn);
            }
        } else {
            mxmn = arr.length;
            for (int j : arr) {
                mxmn = Math.min(j, mxmn);
            }
        }
        return mxmn;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int initMax = 100;
        fillFunction(arr1, initMax, 3);
        displayArr(arr1);
        fillFunction(arr2, initMax, 3);
        displayArr(arr2);
        int sumSize = arr1.length + arr2.length;
        int[] arrAll = new int[sumSize];
        System.arraycopy(arr1, 0, arrAll, 0, arr1.length);
        System.arraycopy(arr2, 0, arrAll, arr1.length, arr2.length);

        System.out.println("Combined arrays: ");
        displayArr(arrAll);

        int[] arrIncludeBoth = new int[0];
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    arrIncludeBoth = addElement(arrIncludeBoth, j);
                    break;
                }
            }
        }
        System.out.println("Numbers inside both arrays: ");
        displayArr(arrIncludeBoth);

        System.out.println("Between highest and lowest: ");
        int max = Math.max(findMaxMin(arr1, true),findMaxMin(arr2, true));
        int min = Math.min(findMaxMin(arr1, false), findMaxMin(arr2, false));
        int[] arrHighLow = new int[1];
        System.out.println(min);
        System.out.println(max);
        arrHighLow[0] = min;
        for (int i = 1; i < max-min+1; i++) {
            arrHighLow = addElement(arrHighLow, arrHighLow[i-1]+1);
        }
        displayArr(arrHighLow);
    }
}
