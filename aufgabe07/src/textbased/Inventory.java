package textbased;

import java.util.Vector;

public class Inventory {
    private Vector<Item> items;

    Inventory() {
        items = new Vector<>(1,1);
    }

    public Vector<Item> getItems() {
        return items;
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public void remove(Item item) {
        this.items.remove(item);
    }
}
