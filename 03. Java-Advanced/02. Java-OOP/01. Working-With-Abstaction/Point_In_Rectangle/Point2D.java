package Point_In_Rectangle;

public class Point2D {
    private final int x;
    private final int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isLessOrEqual(Point2D point) {
        return this.x <= point.x && this.y <= point.y;
    }

    public boolean isGreaterOrEqual(Point2D point) {
        return this.x >= point.x && this.y >= point.y;
    }
}
