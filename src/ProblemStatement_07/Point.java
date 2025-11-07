package ProblemStatement_07;

public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Custom square root using binary search
    private double sqrt(double n) {
        double low = 0;
        double high = n;
        double mid = 0;
        double precision = 0.00001; // 5 decimal places

        if (n == 0 || n == 1) return n;

        while (high - low > precision) {
            mid = (low + high) / 2;
            if (mid * mid > n) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return (low + high) / 2;
    }

    // Distance between two points
    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return sqrt(dx * dx + dy * dy);
    }

    // Translate (move) the point
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // String representation
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

