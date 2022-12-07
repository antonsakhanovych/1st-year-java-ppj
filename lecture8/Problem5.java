// Author: Anton Sakanovych
// ESKA: s26776

public class Problem5 {
    public static void main(String[] args) {
        char sym1 = 'x';
        String sym2 = "o";
        String row = "xoxoxox", nrow="";

        char ch;
        int length = row.length();
        for (int i = 0; i < 5; i++) {
            System.out.println(row);
            for (int j = 0; j < length; j++) {
                    ch = row.charAt(j);
                    ch = (ch == sym1) ? 'o' : 'x';
                    nrow = ch + nrow;
            }
            row = nrow;
            nrow = "";
        }
    }
}
