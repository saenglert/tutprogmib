package aufgabe13;

public enum eCoins {
    ZWEI(200), EIN(100), FUENFZIG(50), ZWANZIG(20), ZEHN(10);

    int centValue;

    eCoins(int centValue) {
        this.centValue = centValue;
    }
}
