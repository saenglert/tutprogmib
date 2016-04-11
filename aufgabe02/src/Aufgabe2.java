import java.util.Arrays;

// Aufgabe 2
public class Aufgabe2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        boolean bedingung = a > b;

        if (a > b && a > c) {
            System.out.println("Bedingung wahr");
        } else {
            System.out.println("Bedingung falsch");
        }

        double[] zahlen = new double[args.length];

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = Double.parseDouble(args[i]);
        }

        System.out.println(Arrays.toString(zahlen));

        /* int sizeX = Integer.parseInt(args[0]);
        int sizeY = (int) b;

        int[][] coordinates = new int [sizeX][sizeY];

        for (int i = 0; i < coordinates.length; i++) {
            //int[] temp = new int[]
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = 0;
            }
        }


        System.out.println(coordinates.toString()); */
    }
}
