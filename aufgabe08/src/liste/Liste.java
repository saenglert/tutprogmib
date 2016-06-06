package liste;

public class Liste {
    public int element;
    public Liste next;

    public Liste(int element) {
        this.element = element;
        this.next = null;
    }

    public void append(int element) {
        if (next == null) next = new Liste(element);
        else next.append(element);
    }

    public int length() {
        int counter = 1;
        Liste next = this.next;

        while (next != null) {
            counter++;
            next = next.next;
        }

        return counter;
    }

    public void remove() {
        if (this.next != null) {
            if (this.next.next == null)
                this.next = null;
            else
                this.next.remove();
        }
    }

    public String toString() {
        StringBuffer out = new StringBuffer();
        out.append(this.element);
        if (this.next != null)
                out.append(", ")
                .append(this.next.toString());

        return out.toString();
    }

    public int summ() {
        /*int summ = this.element;
        Liste next = this.next;

        while (next != null) {
            summ += next.element;
            next = next.next;
        }

        return summ; */

        if (this.next != null) return this.element + this.next.summ();
        else return this.element;
    }

    public void add(int value) {
        this.element += value;
        if (this.next != null) this.next.add(value);
    }
}
