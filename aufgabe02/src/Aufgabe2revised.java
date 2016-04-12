public class Aufgabe2revised {

    public static void main(String[] args) {
        int[] input = parseInput(args);
        minMax(input);
        //recursion(5);
    }

    public static void minMax(int[] input) {
        int max = input[1];
        int min = input[1];

        for (int i = 1; i < input.length; i++) {
            if (isBigger(input[i], max)) {
                max = input[i];
            } else {
                if (isBigger(min, input[i])) {
                    min = input[i];
                }
            }
        }

        System.out.println("Min: " + min + " Max: " + max);
    }

    public static int[] parseInput(String[] input) {
        int[] temp = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            temp[i] = Integer.parseInt(input[i]);
        }

        return temp;
    }

    public static boolean isBigger(int a, int b) {
        return a > b;
    }

    private static void recursion(int input) {
        for (int i = 0; i < input; i++) {
            System.out.print("    ");
        }

        System.out.println("recursion(" + input + ") start");

        if (input <= 0) {
            System.out.println("i = 0! Recursion ends here");
        } else {
            recursion(input - 1);
        }

        for (int i = 0; i < input; i++) {
            System.out.print("    ");
        }

        System.out.println("recursion(" + input + ") end");

    }
}
