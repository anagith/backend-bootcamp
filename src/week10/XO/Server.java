package week10.XO;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    static String[] board = new String[9];
    static Player currentPlayer;

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("The server is waiting for players");
            ExecutorService pool = Executors.newFixedThreadPool(10);
            while (true) {
                pool.execute(new Player(serverSocket.accept(), "X"));
                pool.execute(new Player(serverSocket.accept(), "O"));
            }
        }
    }

    public static boolean hasWon() {
        for (int i = 0; i < 3; i++) {
            if (board[3 * i] == board[3 * i + 1] && board[3 * i + 1] == board[3 * i + 2] && board[3 * i] != null) {
                return true;
            }
            if (board[i] == board[i + 3] && board[i + 3] == board[i + 6] && board[i] != null) {
                return true;
            }
        }
        if (board[0] == board[4] && board[4] == board[8] && board[0] != null) {
            return true;
        }
        if (board[2] == board[4] && board[4] == board[6] && board[2] != null) {
            return true;
        }
        return false;
    }

    public static void changeBoard(int num) {
        board[num] = currentPlayer.getType();
    }

    public static String printBoard() {
        String b = "";
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                b += "\n";
            }
            if (board[i] != null) {
                b += board[i] + " ";
            } else {
                b += i + " ";
            }
        }
        return b;
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}