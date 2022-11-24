public class Problem2 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 10; i++) {
            result += 1/Math.pow(2, i);
            System.out.println(result);
        }
    }
}
