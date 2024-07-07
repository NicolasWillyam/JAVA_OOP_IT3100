package JAVA_OOP_IT3100.HOME_WORK.LESSON_7_TASK_7;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height); // Ensures that setting width or height of the square changes both sides
    }

    @Override
    public String toString() {
        return "Square";
    }

}
