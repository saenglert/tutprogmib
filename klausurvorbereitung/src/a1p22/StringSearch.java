package a1p22;

public class StringSearch {

    public static void main(String[] args) {
        System.out.println(searchString("Midgarlovesme", "me"));
        System.out.println(searchString("Besserwisser", "sser"));
        System.out.println(searchString("Hund", "Bär"));
    }

    public static int searchString(String s1, String s2) {
        int counter = 0;
        int current = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(current)) {
                current++;
                if (current == s2.length()) {
                    counter++;
                    current = 0;
                }
            }
            else
                current = 0;
        }

        return counter;
    }
}
