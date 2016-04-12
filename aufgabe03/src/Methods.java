public class Methods {
    public static void main(String[] args) {
        String word = "Olive";
        System.out.println(word.charAt(0));


        /*String test ="2734687 12 82 8372  23541   661  54  1654 14  ";
        int[] numbers = parseInput(args);
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (isBigger(numbers[i], max)) {
                max = numbers[i];
            } else {
                if (isBigger(min, numbers[i])) {
                    min = numbers[i];
                }
            }
        }

        System.out.println("Min: " + min + " Max: " + max);*/

    }

    public static boolean isBigger(int a, int b) {
        return a > b;
    }

    public static int[] parseInput(String[] input) {
        int[] temp = new int[input.length];

        for (int i = 0; i< input.length; i++) {
            temp[i] = Integer.parseInt(input[i]);
        }

        return temp;
    }
}
