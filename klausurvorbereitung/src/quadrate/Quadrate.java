package quadrate;

public class Quadrate {
    public static void main(String[] args) {
        quadrat(4);
    }

    public static void quadrat(int k) {
        if (k == 1) {
            System.out.println("*");
        } else if (k == 2) {
            System.out.println("**");
            System.out.println("**");
        } else {
            for (int y = 0; y < k; y++) {
                 for (int x = 0; x < k; x++) {
                    if (x == 0 || y == 0 || x == k - 1 || y == k - 1)
                        System.out.print("*");
                    else
                        System.out.print("-");
                } // end for
                System.out.println("");
            } // end for
        } // end else
    } // end method
}
