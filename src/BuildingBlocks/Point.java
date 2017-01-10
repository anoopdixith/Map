package BuildingBlocks;

/**
 * Created by adixith on 1/9/17.
 */
public class Point {
    private double x;
    private double y;

    private static long numberOfPoints = 0;

    public static long getNumberOfPoints() {
        return numberOfPoints;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        numberOfPoints++;
    }

    public Point() {
        this(0.0, 0.0);
    }

}
