
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatServer {
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
            System.out.println("[" + date.format(new Date()) + "]" + name + " Joined the chat");
            send("[" + date.format(new Date()) + "]" + name + " Joined the chat ");
            try {
                writeInDB( "Joined the chat ");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
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

        private void receive() throws IOException, SQLException {
            String message;
            while (flag) {
                message = in.readUTF();
                if (message.equalsIgnoreCase("quit")) {
                    System.out.println("[" + date.format(new Date()) + "]" + name + "Left the chat ");
                    send("[" + date.format(new Date()) + "]" + name + "Left the chat ");

                    writeInDB(message);

                    out.flush();
                    sockets.remove(this);
                    flag = false;
                } else {
                    writeInDB(message);
                    System.out.println("[" + date.format(new Date()) + "]" + name + ":" + message);
                    send("[" + date.format(new Date()) + "]" + name + ":" + message);

                }

            }
        }

        private void writeInDB(String message) throws SQLException {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Green@00me");
            PreparedStatement st = connection.prepareStatement("insert into messages(received_time,user_name,message) values(?,?,?)");
            st.setString(1, date.format(new Date()));
            st.setString(2, name);
            st.setString(3, message);
            st.executeUpdate();
            st.close();
        }

        @Override
        public void run() {
            try {
                while (flag) {
                    receive();
                }
            } catch (IOException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.startup();
    }
}
