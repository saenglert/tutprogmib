public class Strings {

    public static void main(String[] args) {
        String string = "Hallo Welt";


    }

    public static int contains(String string, String searchstring) {
        int temp = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == searchstring.charAt(temp)) temp++;
        }

        return 0;
    }
}
