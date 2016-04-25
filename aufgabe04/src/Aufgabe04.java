public class Aufgabe04 {

    public static void main(String[] args) {
        System.out.println(Aufgabe04.nullstellen(-1,20,0.0001));
    }

    public static double f(double x) {
        return Math.exp(x) + Math.pow(x, 2.0) - 4.0;
    }

    public static double nullstellen(double x, double y, double z) {
        double m = (y - x) / 2 + x;
        double valueX = Aufgabe04.f(x);
        double valueM = Aufgabe04.f(m);
        double valueY = Aufgabe04.f(y);

        if (Math.abs(valueM) < z) return m;
        else {
            if (Math.signum(valueX) != Math.signum(valueM) )
                return Aufgabe04.nullstellen(x, m, z);
            else return Aufgabe04.nullstellen(m, y, z);
        }

        /*double mitte = (x + y) / 2;
        double value = Math.abs(f(mitte));
        if (value < z) {

            return mitte;

        } else {

            if (f(mitte) * f(y) < 0) {
                return nullstellen(mitte, y, z);

            } else {
                return nullstellen(x, mitte, z);

            }
        } */
    }
}
