
// Aufgabe 1
public class Main {
    public static void main(String[] args) {
        int args1 = Integer.parseInt(args[0]);
        int args2 = Integer.parseInt(args[1]);
        int args3 = Integer.parseInt(args[2]);

        System.out.println(args1 + args2 + args3);

        int min;
        int max;

        if (args1 > args2) {
            max = args1;
            min = args2;
        } else {
            max = args2;
            min = args1;
        }

        if (args3 > max) {
            max = args3;
        } else if (args3 < min) {
            min = args3;
        }

        System.out.println("Min: " + min + " Max: " + max);



        //String a = "Hallo";
        //String b = "Welt";
        //int c = 1;
        //int d = 2;

        //System.out.println(a + b);
        //System.out.println(c + d);
        //System.out.println(c + a + b + d);
    }
}