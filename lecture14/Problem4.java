public class Problem4 {
    static boolean checkPali(int[] arr, boolean paliCheck, int step){
        int lastInd = arr.length - 1 - step;
        int middle = (arr.length/2) - 1;
        if (step > middle) return true;
        boolean paliStep = (arr[step] == arr[lastInd]) && paliCheck;
        return paliStep && checkPali(arr, paliStep, step + 1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,1};
        System.out.println(checkPali(arr, true, 0));
    }
}
