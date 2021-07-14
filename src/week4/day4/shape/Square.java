package week4.day4.shape;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            return;
        }
        this.side = side;
    }

    @Override
    protected double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    protected double getPerimeter() {
        return 4 * side;
    }
}
