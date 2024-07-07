
public class Vector {
    private double x = 1.0;
    private double y = 1.0;
    private double z = 1.0;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector minus(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector multiple(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public double dotProduct(Vector other) {
        return (this.x * other.x + this.y * other.y + this.z * other.z);
    }
}