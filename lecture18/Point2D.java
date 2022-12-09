// Author: Anton Sakanovych
// ESKA: s26776

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] get(){
        return new int[]{this.x, this.y, 1};
    }
    public void set(int[] arr){
        this.x = arr[0];
        this.y = arr[1];
    }


}
