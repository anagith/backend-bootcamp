package week4.day4.shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            return;
        }
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
