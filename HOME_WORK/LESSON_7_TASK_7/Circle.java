package JAVA_OOP_IT3100.HOME_WORK.LESSON_7_TASK_7;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super(null, false);
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super(null, false);
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle";
    }

}
