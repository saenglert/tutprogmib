package enumsTesting;

public class Seat {
    static int counter = 0;
    int id;
    Status status;

    Seat() {
        Seat.counter++;
        this.id = Seat.counter;
        this.status = Status.FREI;
    }

    void belegen() throws SitzBelegtException {
        switch (this.status) {
            case FREI:
                this.status = Status.BELEGT;
                break;
            case BELEGT:
                throw new SitzBelegtException();
        }
    }

}
