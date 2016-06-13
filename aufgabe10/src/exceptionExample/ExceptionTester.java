package exceptionExample;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] el = new int[10];
        for (int i = 0; i < el.length; i++)
            el[i] = 0;

        try {
           System.out.println(el[2314]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Du bist doof!");
        }
        System.out.println("Und weiter gehts");
    }

    public static void socketTest() {
        Socket socket = new Socket();

        try {
            socket.connect(new InetSocketAddress("englerts.de",80));

            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            writer.println("GET / HTTP/1.1");
            writer.println("Host: englerts.de");
            writer.println("");
            writer.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message;

            while ((message = reader.readLine()) != null) {
                System.out.println(message);
            }
        } catch (MalformedURLException e) {
            System.out.println("You misspelled the damn thing!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
