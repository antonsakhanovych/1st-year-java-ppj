// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Arrays;

public class Problem4 {
    static boolean isLess(String s1, String s2) {
	if (s1.length() == s2.length()) {
	    return (s1.compareTo(s2) > 0);
	}
	return s1.length() < s2.length();
    }

    static void sortSel(String[] arr) {
	int length = arr.length;
	for (int i = 0; i < length - 1; i++) {
	    int minInd = i;
	    for (int j = i + 1; j < length; j++) {
		if (isLess(arr[j], arr[minInd])) {
		    minInd = j;
		}
	    }
	    String tmp = arr[i];
	    arr[i] = arr[minInd];
	    arr[minInd] = tmp;
	}
    }
    
    public static void main(String[] args) {
	String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
	System.out.println(Arrays.toString(arr));
	sortSel(arr);
	System.out.println(Arrays.toString(arr));
    }

}
