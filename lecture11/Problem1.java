import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        int min = arr[0];
        int max = 0;
        for( int el : arr){
            if (el > max){
                max = el;
            }
            if (el < min){
                min = el;
            }
        }
        int diff = max - min;
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Difference: " + diff);
    }
}
