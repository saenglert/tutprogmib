package textbased;

import java.util.Vector;

public class Room {
    String description;
    String name;
    Inventory items;

    Room (String name, String description, Inventory items) {
        this.name = name;
        this.description = description;
        this.items = items;
    }

}
