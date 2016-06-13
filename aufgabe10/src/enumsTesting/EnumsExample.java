package enumsTesting;

import java.util.Vector;

public class EnumsExample {

    static int seatAmount = 100;
    static Vector<Seat> seats;

    public static void main() {
        seats = new Vector<>(0,1);

        for(int i = 0; i < seatAmount; i++) {
            seats.add(new Seat());
        }

        try {
            seats.elementAt(10).belegen();
        } catch (SitzBelegtException e) {
            e.printStackTrace();
        }
    }
}

