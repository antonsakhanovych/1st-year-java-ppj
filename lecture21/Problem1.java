public class Problem1 {
    public static void main(String[] args) {
        MyString str = new MyString("abcdefgh");
        str.insert(0, "123");
        System.out.println(str.toString());
    }
}
