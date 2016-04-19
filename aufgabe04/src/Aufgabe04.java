public class Aufgabe04 {

    public static void main(String[] args) {
        Aufgabe04.nullstellen(-1,20,0.0001);
    }

    public static double f(double x) {
        return Math.exp(x) + Math.pow(x, 2) - 4;
    }

    public static double nullstellen(double x, double y, double z) {
        double valueX = Aufgabe04.f(x);
        double valueM = Aufgabe04.f((y - x) / 2);
        double valueY = Aufgabe04.f(y);

        if (Math.abs(valueM) < z) {
            return valueM;
        }

        else {

            if (Math.signum(valueX) != Math.signum(valueM)) return Aufgabe04.nullstellen(x, (y - x) / 2, z);
            else return Aufgabe04.nullstellen((y - x) / 2, y, z);
        }
    }
}
