package BuildingBlocks;

/**
 * Created by adixith on 1/9/17.
 */
public class Line {
    public Point getStartingPoint() {
        return startingPoint;
    }

    public Point getEndingPoint() {
        return endingPoint;
    }

    public static long getNumberOfLines() {
        return numberOfLines;
    }

    private Point startingPoint;
    private Point endingPoint;

    private static long numberOfLines = 0;

    public Line(Point startingPoint, Point endingPoint) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    public Line(Point oneEndPoint) {
        this(new Point(0.0, 0.0), oneEndPoint);
    }
}
