public class Problem1 {
    public static void main(String[] args) {
        Square sq1 = new Square(3);
        Square sq2 = new Square(4);
        Square sq3 = Square.getSumSquare(sq1, sq2);
        System.out.println("Sum of areas of two squares: " + (sq1.getArea() + sq2.getArea()));
        System.out.println("Area of the third square: " + sq3.getArea());
    }
}
