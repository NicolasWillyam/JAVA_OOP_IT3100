
// package SHAPE;
public class Square {
    private double sideLength = 1.0;

    public double getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea(double sideLength) {
        return this.sideLength * this.sideLength;
    }

    public double calculatePerimeter(double sideLength) {
        return this.sideLength * 4;
    }

}
