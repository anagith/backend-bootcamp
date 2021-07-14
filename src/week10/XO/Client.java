package week10.XO;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {
        try (Socket socket = new Socket("localhost", 8081)) {
            Scanner scanner = new Scanner(System.in);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Runnable rn = () -> {
                while (true) {
                    String line = "";
                    try {
                        line = in.nextLine();
                    } catch (NoSuchElementException e) {
                        System.exit(0);
                    }
                    System.out.println(line);
                }
            };
            Thread thread1 = new Thread(rn);
            thread1.start();
            while (true) {
                String str = scanner.nextLine();
                if (str.equals("exit")) {
                    break;
                }
                out.println(str);
            }
            in.close();
            scanner.close();
        }
    }
}
