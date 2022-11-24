import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = { 2,3,4,3,2,6,3,6,8,2,9 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
         int tmp = arr[i];
            if (tmp == 0){
                continue;
            }else{
                System.out.print(tmp + " ");
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == tmp) {
                    arr[j]=0;
                }
            }
        }
    }
}
