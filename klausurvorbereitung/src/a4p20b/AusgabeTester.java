package a4p20b;

public class AusgabeTester {
    public static void main(String[] args) {
        for (int y = 0; y < 8; y++)
            try {
                System.out.println("y= " + y);
                int z = f(y);
                System.out.println("z= " + z);
            } catch (Exception e) {
                System.out.println("Fehler bei y= " + y);
            }
    }
    public static int x[] = new int[] { 5, 4, 3, 2, 1 };
    public static int f(int y) {
        int k = x[y];
        System.out.println("k= " + k);
        for (int j = 1; j < 3; j++) {
            k = k * x[y + j];
            System.out.println("k= " + k);
        }
        return k;
    }
}
