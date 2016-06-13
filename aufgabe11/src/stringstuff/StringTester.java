package stringstuff;

import java.util.StringTokenizer;
import java.util.Vector;

public class StringTester {
    public static void main(String[] args) throws AuswertungGescheitertException {
        String input = "123a+4325235+812";
        StringTokenizer tokenizer = new StringTokenizer(input,"+");

        Vector<Integer> values = new Vector<>(0,1);
        while (tokenizer.hasMoreTokens()) {
            try {
                values.add(Integer.parseInt(tokenizer.nextToken()));
            } catch (NumberFormatException e) {
                throw new AuswertungGescheitertException();
            }
        }
    }
}
