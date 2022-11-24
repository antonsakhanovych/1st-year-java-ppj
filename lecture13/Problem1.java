// Author: Anton Sakhanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem1 {

    static void addScores(String[][] arr, int addScore, String name){
        for(String[] el : arr){
            if (name.equals(el[0])){
                el[1] = String.valueOf(Integer.parseInt(el[1]) + addScore);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String[][] arr ={ {"Germany",  "2", "Scotland", "1"},
                            {"Poland",   "2", "Germany",  "0"},
                            {"Germany",  "1", "Ireland",  "1"},
                            {"Poland",   "2", "Scotland", "2"},
                            {"Scotland", "1", "Ireland",  "0"},
                            {"Ireland",  "1", "Poland",   "1"},
                            {"Ireland",  "1", "Scotland", "1"},
                            {"Germany",  "3", "Poland",   "1"},
                            {"Scotland", "2", "Germany",  "3"},
                            {"Ireland",  "1", "Germany",  "0"},
                            {"Scotland", "2", "Poland",   "2"},
                            {"Poland",   "2", "Ireland",  "1"} };
        String[][] scores = {{"Germany", "0"},
                {"Ireland", "0"},
                {"Poland", "0"},
                {"Scotland", "0"},};
        for(String[] el : arr){
            String firstName = el[0];
            int firstScore = Integer.parseInt(el[1]);
            String secondName = el[2];
            int secondScore = Integer.parseInt(el[3]);
            if(firstScore > secondScore) {
                addScores(scores, 3, firstName);
            } else if (firstScore < secondScore){
                addScores(scores, 3, secondName);
            } else {
                addScores(scores, 1, firstName);
                addScores(scores, 1, secondName);
            }
        }
        for(String[] el : scores){
            System.out.println(Arrays.toString(el));
        }
    }
}
