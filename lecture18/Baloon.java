// Author: Anton Sakanovych
// ESKA: s26776

public class Baloon {
    private double helium;
    public Baloon(){
        this.helium = 0.007 + Math.random() * (0.009 - 0.005);
    }

    public double getLoad(){
        return (this.helium * 6) / 0.007;
    }
}
