package JAVA_OOP_IT3100.HOME_WORK.LESSON_7_TASK_7;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super(null, false);
        this.width = 2.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        super(null, false);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
