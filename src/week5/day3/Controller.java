package week5.day3;

import week5.day3.exception.TypeMissMatchException;
import week5.day3.exception.WrongQuantityException;
import week5.day3.utils.Result;

import java.util.Scanner;

public class Controller {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        String input = scanner.next();
        try {
            Command command = new Command(input);
            Result result = vendingMachine.getProduct(command);
            System.out.println(result);
        } catch (TypeMissMatchException | WrongQuantityException e) {
            System.out.println(e.getMessage());
            Controller.start();
        }
    }
}
