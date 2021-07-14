package week10.XO;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static week10.XO.Server.*;

public class Player implements Runnable {
    private Socket socket;
    private String type;
    private Player opponent;
    private Scanner in;
    private PrintWriter out;

    Player(Socket socket, String type) throws IOException {
        this.socket = socket;
        this.type = type;
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), true);
        play(type);
    }

    private void play(String type) {
        if (type.equals("X")) {
            currentPlayer = this;
            out.println("Waiting for opponent to join.");
        } else {
            out.println("Waiting for opponent to move");
            opponent = currentPlayer;
            opponent.opponent = this;
            opponent.out.println("Your turn");
            opponent.out.println(printBoard());
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public void run() {
        System.out.println("Connected: " + type);
        try {
            while (in.hasNextLine()) {
                String selection = in.nextLine();
                if (opponent == null) {
                    out.println("The other player has not joined!");
                } else if (!type.equals(currentPlayer.type)) {
                    out.println("It's not your turn yet!");
                } else if (isNumeric(selection) && Integer.parseInt(selection) < 9
                        && Integer.parseInt(selection) >= 0
                        && board[Integer.parseInt(selection)] == null) {
                    writeOnBoard(Integer.parseInt(selection));
                    out.println(printBoard());
                    if (hasWon()) {
                        endGame();
                    } else {
                        out.println("You just moved. Waiting for opponents move.");
                        currentPlayer = opponent;
                        opponent.out.println("Your Turn");
                        opponent.out.println(printBoard());
                    }
                } else
                    out.println("Type a valid number from 0 to 8.");
            }
        } catch (Exception e) {
            System.out.println("Error:" + socket);
        } finally {
            try {
                socket.close();
                opponent.socket.close();
            } catch (IOException e) {
            }
            System.out.println("Closed: " + socket);
        }
    }

    private void endGame() throws IOException {
        out.println("You won!");
        opponent.out.println(printBoard());
        opponent.out.println("You lost! Better luck next time.");
        opponent.socket.close();
        socket.close();
        System.exit(0);
    }
}