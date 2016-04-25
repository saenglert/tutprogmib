public class Human {
    int legs = 2;
    int arms = 2;
    static int head = 1;
    boolean gender; // true == female, false == male

    public static void scream() {
        System.out.println("Buuuuuuwwwwäääääääääääh");
    }

    public void printHeads() {
        System.out.println(Human.head);
    }

    public boolean hasPeriod() {
        return gender;
    }
}
