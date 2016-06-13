package interfaceExample;

import java.util.Vector;

public class InterfaceTester {
    static Vector<Shape> shapes = new Vector<>(0,1);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double rand = Math.random();

            if (rand > 0.5)
                shapes.add(new Circle(Math.random() * 10));
            else
                shapes.add(new Square(Math.random() * 10));
        }

        int index = (int) (Math.random() * shapes.size());

        Shape element = shapes.elementAt(index);

        if (element instanceof Circle) {
            Circle kreis = (Circle) element;
            System.out.print("Glückwunsch, es ist ein Kreis");
        } else if (element instanceof Square) {
            Square quadrat = (Square) element;
            System.out.print("Glückwunsch, es ist ein Quadrat");
        } else
            System.out.println("Es ist ein Neuter");

    }
}
