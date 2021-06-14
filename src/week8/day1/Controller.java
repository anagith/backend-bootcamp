package week8.day1;

import week8.day1.exception.TypeMissMatchException;
import week8.day1.exception.WrongQuantityException;
import week8.day1.utils.Result;

import java.io.*;
import java.util.Scanner;

public class Controller {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = null;
        File file = new File("vendingMachine.txt");
        vendingMachine = getVendingMachine(vendingMachine, file);

        String input = scanner.next();
        while (input != "4") {
            try {
                Command command = new Command(input);
                Result result = vendingMachine.getProduct(command);
                System.out.println(result);
                try (FileOutputStream outFile = new FileOutputStream(file);
                     ObjectOutputStream out = new ObjectOutputStream(outFile)) {

                    out.writeObject(vendingMachine);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Controller.start();

            } catch (TypeMissMatchException | WrongQuantityException e) {
                System.out.println(e.getMessage());
                Controller.start();
            }
        }
    }

    private static VendingMachine getVendingMachine(VendingMachine vendingMachine, File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                vendingMachine = new VendingMachine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (FileInputStream InputFile = new FileInputStream(file);
                 ObjectInputStream in = new ObjectInputStream(InputFile)) {
                vendingMachine = (VendingMachine) in.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return vendingMachine;
    }
}
