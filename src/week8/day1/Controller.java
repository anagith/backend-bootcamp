package week8.day1;

import week8.day1.exception.TypeMissMatchException;
import week8.day1.exception.WrongQuantityException;
import week8.day1.utils.Result;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {

    private static final Logger LOGGER = Logger.getLogger("Logger 1");

    public static void start() {
        LOGGER.log(Level.INFO, "HELLOO THERE");
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = null;
        File file = new File("vendingMachine.txt");
        vendingMachine = getVendingMachine(vendingMachine, file);

        String input = scanner.next();
        while (!input.equals("4")) {
            try {
                Command command = new Command(input);
                Result result = vendingMachine.getProduct(command);
                System.out.println(result);
                try (FileOutputStream outFile = new FileOutputStream(file);
                     ObjectOutputStream out = new ObjectOutputStream(outFile)) {

                    out.writeObject(vendingMachine);

                } catch (FileNotFoundException e) {
                    LOGGER.log(Level.WARNING, "FILE NOT FOUND");
                } catch (IOException e) {
                    LOGGER.log(Level.WARNING, "IO EXCEPTION");
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
                boolean newFile = file.createNewFile();
                vendingMachine = new VendingMachine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (FileInputStream InputFile = new FileInputStream(file)) {
                if (InputFile.available() != 0) {
                    ObjectInputStream in = new ObjectInputStream(InputFile);
                    vendingMachine = (VendingMachine) in.readObject();
                }
            } catch (FileNotFoundException e) {
                LOGGER.log(Level.WARNING, "FILE NOT FOUND");
            } catch (IOException e) {
                LOGGER.log(Level.WARNING, "IO EXCEPTION");
            } catch (ClassNotFoundException e) {
                LOGGER.log(Level.WARNING, "CLASS NOT FOUND");
            }
        }
        return vendingMachine;
    }
}
