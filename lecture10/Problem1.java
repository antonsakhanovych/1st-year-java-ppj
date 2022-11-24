public class Problem1 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 10;
        }
        System.out.println();
        System.out.println("Print out array");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Print out even numbers");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
        System.out.println("Print out numbers that are odd when casted to int");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if ((int)arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
