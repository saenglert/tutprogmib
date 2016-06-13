package generics;

public class GenericsTester {

    public static void main(String[] args) {
        RautenKarte<String, Integer> muenzen = new RautenKarte<>();

        muenzen.add("2€", 5);
        muenzen.add("1€", 1);
        System.out.println(muenzen.getValue("2€"));
        System.out.println(muenzen.getValue("1€"));
        muenzen.add("2€", 10);
        System.out.println(muenzen.getValue("2€"));
    }
}
