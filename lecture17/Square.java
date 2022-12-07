import com.sun.source.tree.ReturnTree;

public class Square {
    private final double lenght;
    public Square(double length){
        this.lenght = length;
    }
    public double getLength(){
        return this.lenght;
    }
    public double getDiagonal(){
        return this.lenght * Math.sqrt(2);
    }

    public double getPerim(){
        return this.lenght * 4;
    }

    public double getArea(){
        return this.lenght * this.lenght;
    }

    static Square getSumSquare(Square sq1, Square sq2){
        double length = Math.sqrt(sq1.getArea() + sq2.getArea());
        return new Square(length);
    }

}
