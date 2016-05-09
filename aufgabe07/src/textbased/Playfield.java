package textbased;

import java.util.Vector;

public class Playfield {
    private Vector<Room> rooms;
    private int activeRoom;

    Playfield(Room room) {
        this.rooms = new Vector<>(1,1);
        this.rooms.add(room);
        this.activeRoom = 0;
    }

    public Vector<Room> getRooms() {
        return this.rooms;
    }

    public Room getActiveRoom() {
        return this.rooms.elementAt(this.activeRoom);
    }

    public void changeRoom(int newRoom) {
        this.activeRoom = newRoom;
    }

    public void changeToRandomRoom() {
        int rand = activeRoom;

        while (rand == activeRoom) {
            rand = (int) Math.round(Math.random() * this.rooms.size());
        }
    }

    public void add(Room room) {
        this.rooms.add(room);
    }

    public void remove(Room room) {
        this.rooms.remove(room);
    }
}
