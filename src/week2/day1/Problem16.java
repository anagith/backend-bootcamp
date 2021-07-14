package week2.day1;

import java.util.Random;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = random.nextInt();
        int choice;
        do {
            choice = scanner.nextInt();
            if (choice > guess) {
                System.out.println("Too high,try again");
            } else if (choice < guess) {
                System.out.println("Too low,try again");
            } else {
                System.out.println("Yes,you guessed the number");
            }
        }
        while (guess != choice);
    }
}
