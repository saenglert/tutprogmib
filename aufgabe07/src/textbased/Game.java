package textbased;

import java.io.*;

public class Game {
    private static boolean running = true;

    private static Playfield playfield;
    private static Inventory inventory;


    public static void main(String[] args) {
        Game.setup();

        while (running) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("####################");
            System.out.println("You are in the " + Game.playfield.getActiveRoom().name);
            System.out.println("####################");
            System.out.println(Game.playfield.getActiveRoom().description);
            System.out.println("What do you want to do?");

            try {
                String message = in.readLine();
                switch (message) {
                    case "q":
                    case "quit":
                        System.out.println("See you on the other side ...");
                        Game.running = false;
                        break;
                    default:
                        System.out.println("Invalid Command. Input was: " + message);
                        System.out.println("Commands include: look, take, drop, inventory, change, quit");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void setup() {
        Game.setupPlayfield();
        Game.inventory = new Inventory();
    }


    private static void setupPlayfield() {
        Game.playfield = new Playfield(Game.setupDungeon());
        Game.playfield.add(Game.setupLibrary());
        Game.playfield.add(Game.setupTavern());
    }

    private static Room setupDungeon() {
        Inventory items = new Inventory();
        items.add(new Food("Cake", "A delicious cake", 10, 9999));
        items.add(new Armor("Topprotector MK. IV", "The latest installment in the protector series for upper body parts", "Helmet", "Wood", 0));
        return new Room(
                "Dungeon",
                "You enter the dungeon through an old and rusty iron gate. The first thing that hits you as you look around is the stunning silence, only occasionally pierced by horrific screams of pain in the distance.",
                items
        );
    }

    private static Room setupLibrary() {
        Inventory items = new Inventory();
        items.add(new Item("The Tales of Bandle the Bard", "An infamous yet terrible written book about the adventures of a Bard named Bandle - Seriously ... who came up with that shit?"));
        items.add(new Armor("Wizardhat", "Every serious wizard needs one of these!", "Helmet", "Cloth", 10));
        return new Room(
                "Library",
                "As you walk through rows and rows of bookshelves in the library you can't help but notice that you cannot spot the top of said shelves. You guess they are somewhere over those clouds above you.",
                items
        );
    }

    private static Room setupTavern() {
        Inventory items = new Inventory();
        items.add(new Item("Knife", "A standard kitchen knife. Point shard end away from user"));
        items.add(new Armor("Breeches", "Someone seems to have lost these. Guess you are going to catch someone with his Breeches down soon *hehe*", "Bottom", "Cloth", 10));
        return new Room(
                "Tavern",
                "Dodging the mug that's being hurled through the open door you enter the local tavern. Straight away you are surrounded by a warm smell of a roaring fire mixed with spicy beer.",
                items
        );
    }
}