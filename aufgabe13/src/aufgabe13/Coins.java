package aufgabe13;

import java.util.HashMap;

public class Coins {
    HashMap<eCoins, Integer> coins;

    public Coins() {
        this.coins = new HashMap<>(0,1);
    }

    public void setCoin(eCoins coin, int value) {
        this.coins.put(coin, value);
    }


}
