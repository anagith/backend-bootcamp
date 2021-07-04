package week10.day3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
    static boolean flag = true;
    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    public Client() {
        try {
            socket = new Socket("localhost", 8800);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void startup() {
        try {

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            Thread thread = new Thread(new Thread(() -> {
                DataInputStream in = null;
                while (flag) {
                    try {
                        in = new DataInputStream(socket.getInputStream());
                        String accept = null;
                        try {
                            accept = in.readUTF();
                        } catch (SocketException e) {
                            System.out.println("You have left the group chat");
                        }
                        System.out.println(accept);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    socket.close();
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
            thread.start();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your username:");
            String name = scanner.nextLine();
            out.writeUTF(name);
            System.out.println(name + ",Welcome to the chat room, enter quit to exit");
            while (flag) {
                String send = scanner.nextLine();
                if (send.equalsIgnoreCase("quit")) {
                    flag = false;
                }
                out.writeUTF(send);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(100);
                socket.close();
                in.close();
                out.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.startup();
    }
}


