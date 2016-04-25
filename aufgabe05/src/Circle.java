public class Circle {
    double radius;

    Circle() {
        this.radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
    }
    public double surface() {
        return Math.PI * radius * radius;
    }
}
