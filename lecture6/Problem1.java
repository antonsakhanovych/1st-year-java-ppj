// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean a1 = (num>-15 && num<=-10);
        boolean a2 = (num>-5 && num<0);
        boolean a3 = (num>5 && num<10);
        boolean a = (a1 || a2 || a3);
        boolean b1 = (num<=-13);
        boolean b2 = (num>-8 && num<=-3);
        boolean b = (b1 || b2);
        boolean c = (num>=-4);
        String result = "Your number is on intervals: ";
        if(a){
            result += "(-15, -10] U (-5, 0) U (5, 10) ";
        }
        if(b){
            result += "and (-infinity, -13] U (-8, -3] ";
        }
        if(c){
            result += "and [-4, infinity)";
        }
        System.out.println(result);
    }
}

