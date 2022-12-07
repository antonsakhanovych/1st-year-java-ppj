public class Temperature {
    private final double tempr;
    public Temperature(double tempr, char unit){
        switch (unit) {
            case 'C' -> this.tempr = tempr;
            case 'K' -> this.tempr = tempr - 273.15;
            case 'F' -> this.tempr = (5. / 9) * (tempr - 32);
            default -> throw new IllegalArgumentException("Provide correct units!");
        }
    }
    public double getInC(){
        return this.tempr;
    }
    public double getInK(){
        return this.tempr + 273.15;
    }
    public double getInF(){
        return ((9./5) * this.tempr) + 32;
    }
}
