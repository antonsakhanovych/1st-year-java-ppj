public class FuncStat {
    public static int fiboR(int n){
        if (n <= 1){
            return n;
        }
        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n){
	if (n <= 1){
            return n;
        }
        int sum = 0;
        int prevOne = 1;
        int prevTwo = 0;
        for (int i = 2; i <= n; i++) {
            sum = prevOne + prevTwo;
	    prevTwo = prevOne;
	    prevOne = sum;
        }
        return sum;
    }

    public static int factR(int n){
	if (n == 1) {
	    return 1;
	}
	return n * factR(n - 1);
    }

    public static int factI(int n) {
	int result = 1;
	for (int i = 1; i <= n; i++) {
	    result *= i;
	}
	return result;
    }

    public static int gcdR(int a, int b) {	
	int remainder = a > b ? a % b : b % a;
	if (remainder == 0){
	    return a > b ? b : a;
	}
	return gcdR(a > b ? b : a, remainder);
	
    }

    public static int gcdI(int a, int b) {
	if (b > a) {
	    int tmp = a;
	    a = b;
	    b = tmp;
	}
	while(true) {
	    int remainder = a % b;
	    if (remainder == 0) {
		return b;
	    }
	    int tmp = b;
	    b = a % b;
	    a = tmp;
	}
    }

    public static int maxElem(int[] arr, int from) {
	if (from == arr.length - 1){
	    return arr[from];
	}
	int max = maxElem(arr, from + 1);
	return arr[from] > max ? arr[from] : max;
    }

    public static int numEven(int[] arr, int from) {
	int evenness = arr[from] % 2 == 0 ? 1 : 0;
	if (from == arr.length - 1) {
	    return evenness;
	}
	return evenness + numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
	if (from == arr.length || from == (arr.length / 2)) {
	    return;
	}
	int tmp = arr[from];
	arr[from] = arr[arr.length - 1 - from];
	arr[arr.length - 1 - from] = tmp;
	reverse(arr, from + 1);
    }

    public static boolean isPalindrom(String s) {
	if (s.length() == 0 || s.length() == 1) {
	    return true;
	}
	char firstChar = s.charAt(0);
	char secondChar = s.charAt(s.length() - 1);
	String newS = s.substring(1, s.length() - 1);
	
	return firstChar==secondChar && isPalindrom(newS);
    }
    
}
