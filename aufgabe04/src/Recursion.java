public class Recursion {
    public static void main(String[] args) {
        recursion(10);
        recursion(20);
    }

    public static void recursion(int value) {
        for (int i = 0; i < value; i++) {
            System.out.print("     ");
        }
        System.out.println("Recursion(" + value + ") start");

        if(value > 0) recursion(value - 1);
        else System.out.println("Value = 0 Recursion Ends");

        for (int i = 0; i < value; i++) {
            System.out.print("     ");
        }
        System.out.println("Recursion(" + value + ") end");
    }
}
