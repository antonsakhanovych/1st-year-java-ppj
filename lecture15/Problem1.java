// Author: Anton Sakanovych
// ESKA: s26776

public class Problem1 {

    static int count(int[] arr, int from, int what) {

        if (from == arr.length - 1) return arr[from] == what ? 1 : 0;
        if (arr[from] == what){
            return count(arr, from + 1, what) + 1;
        } else {
            return count(arr, from + 1, what);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("2 -> " + count(a,0,2));
        System.out.println("3 -> " + count(a,0,3));
    }
}
