package interfaceExample;

public class Circle implements Shape{
    double size;

    public Circle(double size) {
        this.size = size;
    }

    public double surface() {
        return  Math.PI * Math.pow(this.size, 2);
    }

    public double circumference() {
        return Math.PI * this.size;
    }
}
