package ProblemStatement_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x y):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x y):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();

        System.out.println("Enter side length of the square:");
        double side = sc.nextDouble();

        System.out.println("Enter translation values (dx dy) for Point 1:");
        double dx = sc.nextDouble();
        double dy = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Circle circle = new Circle(radius);
        Square square = new Square(side);

        System.out.println("Distance: " + p1.distance(p2));
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());

        p1.translate(dx, dy);
        System.out.println("Translated Point1: " + p1.toString());

    }
}
