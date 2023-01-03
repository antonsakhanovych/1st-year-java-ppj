import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int num = 421314;
        byte[] res = uniqueDigits(num);
        System.out.println(Arrays.toString(res));
    }

    static byte[] addValue(byte[] arr, byte val){
        int length = arr.length;
        byte[] newArr = new byte[arr.length + 1];
        newArr[length] = val;
        if (length != 0){
            System.arraycopy(arr, 0, newArr, 0, length);
        }
        return newArr;
    }
    static byte[] uniqueDigits(int num){
        byte[] res = new byte[0];
        String[] sArr = Integer.toString(num).split("");
        res = addValue(res, Byte.parseByte(sArr[0]));
        mainLoop:
        for(int i = 1; i < sArr.length; i++){
            for(byte j: res){
                if (Byte.parseByte(sArr[i]) == j) {
                    continue mainLoop;
                }
            }
            res = addValue(res, Byte.parseByte(sArr[i]));
        }
        return res;
    }
}
