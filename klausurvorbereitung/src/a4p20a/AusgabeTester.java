package a4p20a;

public class AusgabeTester {
    public static void main(String[] args) {
        int x[] = { 2, 17, 5, 3, 4, 2 };
        int r = 0;
        while (r > -1) {
            System.out.println(r);
            r = x[x[r]];
        }
    }
}
