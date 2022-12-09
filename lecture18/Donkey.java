// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Arrays;

public class Donkey {
    private double mass;
    private Baloon[] arrBall = new Baloon[1];
    public Donkey(double mass){
        this.mass = mass;
        arrBall[0] = new Baloon();
    }

    public int getAmountBaloons(){
        return this.arrBall.length;
    }
    public void addBaloon(Baloon b){
        Baloon[] newBallArr = new Baloon[this.arrBall.length + 1];
        System.arraycopy(arrBall, 0, newBallArr, 0, arrBall.length);
        newBallArr[this.arrBall.length] = b;
        this.arrBall = newBallArr;
    }
    public boolean isFlying(){
        double weight = 0;
        for(Baloon b : this.arrBall){
            weight += b.getLoad();
        }
        return (weight / 1000) > this.mass;
    }
}
