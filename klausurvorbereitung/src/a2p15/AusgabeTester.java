package a2p15;

public class AusgabeTester {
    public static void f(int x) {
        try {
            System.out.println("A" + x);
            try {
                System.out.println("B" + x);
                if (x==4) {
                    System.out.println("C" + x);
                    throw new Exception();
                }
                System.out.println("D" + x);
            } catch (Exception e) {
                System.out.println("E" + x);
            }
            System.out.println("F" + x);
            if (x>2)
                throw new Exception();
            System.out.println("G" + x);
        } catch (Exception e) {
            System.out.println("H" + x);
        }
    }
    public static void main (String[] args) {
        f(1);
        f(3);
        f(4);
    }
}
