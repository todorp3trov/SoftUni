package Point_In_Rectangle;

public class Rectangle {
    private final Point2D bottomLeft;
    private final Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point2D point) {
        return point.isGreaterOrEqual(this.bottomLeft) && point.isLessOrEqual(this.topRight);
    }
}
