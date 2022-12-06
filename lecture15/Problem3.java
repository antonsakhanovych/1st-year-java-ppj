import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
	System.out.println(FuncStat.factR(12));
	System.out.println(FuncStat.factI(12));
	System.out.println(FuncStat.gcdR(12125,40643));
	System.out.println(FuncStat.gcdI(12125,40643));
	int[] a = {3,8,2,9,7,4};
	System.out.println("Max     : " + FuncStat.maxElem(a,0));
	System.out.println("Num even: " + FuncStat.numEven(a,0));
	System.out.println("Before:   " + Arrays.toString(a));
	FuncStat.reverse(a,0);
	System.out.println("After :   " + Arrays.toString(a));
	System.out.println("Is'radar'a palindrom? " +FuncStat.isPalindrom("radar"));
	System.out.println("Is'abba'a palindrom?  " +FuncStat.isPalindrom("abba"));
	System.out.println("Is'rover'a palindrom? " +FuncStat.isPalindrom("rover"));
    }
}
