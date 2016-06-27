package a2p10p5;

public class AusgabeTester {
    public static int f(int[] x, int i) throws Exception {
        if ((2 * i < x.length) && (i >= 0))
            return x[2 * i];
        else
            throw new Exception();
    }
    public static void g(int[] x, int i) throws Exception {
        try {
            System.out.println(f(x, i));
        } catch (Exception e) {
            System.out.println("Fehler");
        }
    }
    public static void main(String[] args) {
        try {
            int x[] = { 1, 7, 3, 5 };
            g(x, 0);
            g(x, 1);
            g(x, 5);
            g(null, 4);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
