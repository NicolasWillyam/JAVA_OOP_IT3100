package JAVA_OOP_IT3100.HOME_WORK.LESSON_7_TASK_7;

public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean isFilled) {
        this.filled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
