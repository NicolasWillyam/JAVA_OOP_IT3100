package JAVA_OOP_IT3100.HOME_WORK.LESSON_7_TASK_7;

public class Test {
    public static void main(String[] args) {
        Square square1 = new Square(); // Using default constructor
        Square square2 = new Square(5.0); // Constructor with side length parameter
        Square square3 = new Square("red", true, 3.0); // Constructor with color, filled, and side length parameters

        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        System.out.println(square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());

        System.out.println(square3);
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());

        square1.setSide(4.0); // Setting the side length of square1
        System.out.println("After setting side length of square1: ");
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
    }
}
