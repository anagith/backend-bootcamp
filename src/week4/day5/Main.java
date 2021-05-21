package week4.day5;

import week4.day5.models.Cup;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String input = scanner.next();
        Command command = new Command(input);
        Cup product = coffeeMachine.getProduct(command);
        System.out.println(product);

        //Controller.start
    }
}
