package ProblemStatement_07;

public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14159; // manually defined final

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
