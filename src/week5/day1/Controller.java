package week5.day1;

import java.util.Scanner;

public class Controller {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 -> archer
                Enter 2 -> swordsman
                Enter 3 -> mage\s""");
        int input = scanner.nextInt();
        if (input < 1 || input > 3) {
            System.out.println("wrong input");
        } else {
            new Battle(input);
        }
    }

}
