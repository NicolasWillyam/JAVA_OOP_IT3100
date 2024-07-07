
public class Circle {
    private double radius = 1.0;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return this.radius * this.radius * 3.14;
    }

    public double calculatePerimeter(double radius) {
        return this.radius * 3.14;
    }
}
