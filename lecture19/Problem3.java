import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int num = 421314;
        byte[] res = uniqueDigits(num);
        System.out.println(Arrays.toString(res));
    }
    static boolean isExponent(byte value){
        boolean isBigger = false;
        int powTwo = 1;
        while(!isBigger){
            powTwo *= 2;
            if (value <= powTwo){
                isBigger = true;
            }
        }
        return value == powTwo;
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

        mainLoop:
        for (String s : sArr) {
            if (isExponent(Byte.parseByte(s))) {
                continue;
            }
            for (byte j : res) {
                if (Byte.parseByte(s) == j) {
                    continue mainLoop;
                }
            }
            res = addValue(res, Byte.parseByte(s));
        }
        return res;
    }

}
