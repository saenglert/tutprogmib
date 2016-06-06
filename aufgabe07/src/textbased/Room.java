package textbased;

public class Room {
    String description;
    String name;
    Inventory inventory;

    Room (String name, String description, Inventory inventory) {
        this.name = name;
        this.description = description;
        this.inventory = inventory;
    }

}
