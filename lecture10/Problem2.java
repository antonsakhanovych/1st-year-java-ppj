// Author: Anton Sakanovych
// ESKA: s26776

public class Problem2 {
    public static void main(String[] args) {
        char[] arr = new char[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(Math.random()*(57-33)+33);
            System.out.println(arr[i]);
        }

        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[tmp] > arr[i]){
                tmp = i;
            }
        }
        System.out.println("Index of the smallest character is:" + tmp);

        }
    }
