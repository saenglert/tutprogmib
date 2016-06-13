package interfaceExample;

public class Square implements Shape {
    double size;

    Square(double size) {
        this.size = size;
    }

    public double surface() {
        return Math.pow(this.size, 2);
    }

    public double circumference() {
        return 4 * this.size;
    }
}
