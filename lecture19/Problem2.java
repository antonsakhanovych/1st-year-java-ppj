public class Problem2 {
    public static void main(String[] args) {
        byte num = 30;
        System.out.println(isExponent(num));
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
}
