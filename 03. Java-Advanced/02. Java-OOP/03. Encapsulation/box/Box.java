package box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.validateParameter(length, "Length");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.validateParameter(width, "Width");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.validateParameter(height, "Height");
        this.height = height;
    }

    private void validateParameter(double parameter, String messagePrefix) {
        if (parameter <= 0) {
            throw new IllegalArgumentException(messagePrefix + " cannot be zero or negative");
        }
    }

    public double calculateSurfaceArea() {
        return 2 * (this.length * this.width) +
                2 * (this.length * this.height) +
                2 * (this.width * this.height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (this.length * this.height) +
                2 * (this.width * this.height);
    }

    public double calculateVolume() {
        return this.length * this.height * this.width;
    }
}
