package week5.day3;

import week5.day3.utils.Result;

import java.util.Scanner;

public class Controller {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        String input = scanner.next();
        Command command = new Command(input);
        Result result = vendingMachine.getProduct(command);
        System.out.println(result);
    }
}
