package week10.day3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Server {
    private List<ThreadServer> sockets = new ArrayList<>();
    private final SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");

    public void startup() {
        try {
            System.out.println("Server on");
            System.out.println("Listen on port 8800");
            ServerSocket serverSocket = new ServerSocket(8800);

            while (true) {
                Socket accept = serverSocket.accept();
                new Thread(new ThreadServer(accept)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ThreadServer implements Runnable {
        private Socket socket;
        private DataInputStream in;
        private DataOutputStream out;
        private String name;

        private Boolean flag = true;

        public ThreadServer(Socket socket) throws IOException {
            this.socket = socket;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            String str = in.readUTF();
            name = str;
            System.out.println("[" + date.format(new Date()) + "]" + name + "Joined the chat");
            send("[" + date.format(new Date()) + "]" + name + "Joined the chat ");
            sockets.add(this);
        }

        private void send(String message) throws IOException {
            for (ThreadServer threadServer : sockets) {
                if (threadServer.socket != socket) {
                    threadServer.out.writeUTF(message);
                    threadServer.out.flush();
                }
            }
        }

        private void receive() throws IOException {
            String message;
            while (flag) {
                message = in.readUTF();
                if (message.equalsIgnoreCase("quit")) {
                    System.out.println("[" + date.format(new Date()) + "]" + name + "Left the chat ");
                    send("[" + date.format(new Date()) + "]" + name + "Left the chat ");
                    out.flush();
                    sockets.remove(this);
                    flag = false;
                } else {
                    System.out.println("[" + date.format(new Date()) + "]" + name + ":" + message);
                    send("[" + date.format(new Date()) + "]" + name + ":" + message);
                }
            }
        }

        @Override
        public void run() {
            try {
                while (flag) {
                    receive();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.startup();
    }
}

