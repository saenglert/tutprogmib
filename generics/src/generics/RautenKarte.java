package generics;

import java.util.Vector;

public class RautenKarte<K, V> {
    Vector<K> schluessel;
    Vector<V> werte;

    RautenKarte() {
        this.schluessel = new Vector<>();
        this.werte = new Vector<>();
    }

    public V add(K schluessel, V wert) {
        if (this.containsKey(schluessel))
            return this.werte.set(this.schluessel.indexOf(schluessel), wert);
        else {
            this.schluessel.add(schluessel);
            this.werte.add(wert);
            return null;
        }
    }

    public boolean containsKey(K schluessel) {
        for (int i = 0; i < this.schluessel.size(); i++)
            if (this.schluessel.elementAt(i) == schluessel)
                return true;
        return false;
    }

    public V getValue(K schluessel) {
        if (this.containsKey(schluessel))
            return this.werte.elementAt(this.schluessel.indexOf(schluessel));
        else
            return null;
    }
}
