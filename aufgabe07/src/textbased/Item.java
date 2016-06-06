package textbased;

public class Item {
    private static int counter = 0;
    private final int id;
    String name;
    String description;

    public Item(String name, String description) {
        this.id = ++counter;
        this.name = name;
        this.description = description;
    }

    public int getId() {return this.id;}
}
