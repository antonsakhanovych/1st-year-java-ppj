//Author: Anton Sakhanovych
//ESKA: s26776

public class Problem3 {

    // generic method for printing arrays
    static<T> void printArrGeneric( T[] arr){
	if(arr.getClass().isArray()){
	    System.out.print("[ ");
	    for (T el : arr) {
		System.out.print(el + " ");
	    }
	    System.out.println("]");
	}
    }
    
    // method for generating arrays
     static int[] generate(int x, int to){
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*to);
        }
        return arr;
    }

    
    // method for printing int arrays
    static void printArr( int[] arr){
	if(arr.getClass().isArray()){
	    System.out.print("[ ");
	    for (int el : arr) {
		System.out.print(el + " ");
	    }
	    System.out.println("]");
	}
    }
    
    // get amount of odd numbers
    static int numOdd(int[] arr) {
	int count = 0;
	for (int el : arr) {
	    if (el % 2 != 0) {
		count++;
	    }
	}
	return count;
    }

    // get amount of even numbers
    static int numEven(int[] arr) {
	int count = 0;
	for (int el : arr) {
	    if (el % 2 == 0) {
		count++;
	    }
	}
	return count;
    }

    // get arrays of odd numbers and even numbers
    static int[][] getOddEven(int[] arr){
	int[] odd = new int[numOdd(arr)];
	int[] even = new int[numEven(arr)];
	int oddInd = 0;
	int evenInd = 0;
	
	for(int el : arr){
	    if(el % 2 != 0){
		odd[oddInd] = el;
		oddInd++;
	    } else{
		even[evenInd] = el;
		evenInd++;
	    }
	}
	
	int[][] retVal = { odd, even };
	return retVal;
    }

    // get indices of max and min
	static int[] getMinMax(int[] arr) {
	int indMin = 0;
	int indMax = 0;
	for (int i = 0; i < arr.length; i++){
	    if (arr[i] > arr[indMax]) {
		indMax = i;
	    } else if (arr[i] < arr[indMin]) {
		indMin = i;
	    }
	}
	int[] retVal = { indMin, indMax };
	return retVal;
    }

    public static void main(String[] args) {
	// generics don't work with primitive data types ;(
	// Integer[] arr = { 20, 2, 4, 3, 6, 5 };
	int[] arr = generate(10, 100);
	
	printArr(arr);
	
	System.out.println("Odd: " + numOdd(arr));
	System.out.println("Even: " + numEven(arr));
	int[][] oddEvenArr = getOddEven(arr);
	
	System.out.print("OddArr: ");
	printArr(oddEvenArr[0]);
	System.out.print("EvenArr: ");
	printArr(oddEvenArr[1]);

	int[] minMaxArr = getMinMax(arr);

	System.out.println("indMin: " + minMaxArr[0]);
	System.out.println("indMax: " + minMaxArr[1]);
    }
}
