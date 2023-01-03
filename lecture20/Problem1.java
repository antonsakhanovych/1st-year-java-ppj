public class Problem1 {
    static String swap(String str){
        int half = str.length() / 2;
        String firstHalf = str.substring(0, half);
        String secondHalf = str.substring(half);
        return secondHalf.concat(firstHalf);
    }
    public static void main(String[] args) {
        System.out.println(swap("abcdef"));
    }
}
