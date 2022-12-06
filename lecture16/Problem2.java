// Author: Anton Sakanovych
// ESKA: s26776

public class Problem2 {

    static void info(int[] arr){
	System.out.print("Length " + arr.length + ": ");
	System.out.print("[ ");
	for(int el : arr){
	    System.out.print(el + " ");
	}
	System.out.print("]");
	System.out.println();
    }

    
    static int[] add(int[] arr, int elem){
        int[] newArr = new int[arr.length + 1];
	// insert value if arr is empty
	if (arr.length == 0) {
	    newArr[0] = elem;
	    return newArr;
	}

	// insert values for other cases
	
	boolean inserted = false;
        for (int i = 0; i < newArr.length; i++){
	    boolean inside = i < arr.length;
	    if (inside && !inserted && elem <= arr[i]) {
		newArr[i] = elem;
		inserted = true;
	    } else if(!inside && !inserted ){
		newArr[i] = elem;
	    } else if(inside && !inserted) {
		newArr[i] = arr[i];
	    } else {
		newArr[i] = arr[i - 1];
	    }
	}
        return newArr;
    }

    
    
    static int[] delIndex(int[] a, int ind) {
	int[] newArr = new int[a.length - 1];
	System.arraycopy(a, 0, newArr, 0, ind);
	System.arraycopy(a, ind + 1, newArr, ind, newArr.length - ind);
	return newArr;
    }

    static int[] delFirst(int[] a, int e) {
	int ind = -1;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == e) {
		ind = i;
		break;
	    }
	}
	if (ind != -1) {
	    return delIndex(a, ind);
	} else {
	    return a;
	}
    }

    static int[] delLast(int[] a, int e) {
	int ind = -1;
	for (int i = a.length - 1; i >= 0; i--) {
	    if (a[i] == e) {
		ind = i;
		break;
	    }
	}
	if (ind != -1) {
	    return delIndex(a, ind);
	} else {
	    return a;
	}
    }

    static int[] delAll(int[] a, int e) {
	int minInd = -1;
	int maxInd = -1;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == e) {
		minInd = i;
		break;
	    }
	}

	for (int i = a.length - 1; i >= 0; i--) {
	    if (a[i] == e) {
		maxInd = i;
		break;
	    }
	}
	if(minInd==-1 || maxInd==-1){
	    return a;
	}
	int[] newArr = new int[a.length - (maxInd - minInd + 1)];
	System.arraycopy(a, 0, newArr, 0, minInd);
	System.arraycopy(a, maxInd + 1, newArr, minInd, a.length - maxInd - 1);
	return newArr;
    }

    public static void main(String[] args) {
	int[] a = {};
	info(a);
        a = add(a, 4);
	a = add(a, 1);
	a = add(a, 3);
	a = add(a, 7);
	a = add(a, 4);
	a = add(a, 2);
	a = add(a, 7);
	a = add(a, 4);
	a = add(a, 8);
	a = add(a, 7);
	a = add(a, 4);
	a = add(a, 5);
	info(a);

	a = delIndex(a, 2);
	a = delLast(a, 7);
	a = delFirst(a, 7);
	info(a);

	a = delAll(a, 4);
	info(a);
    }
}
