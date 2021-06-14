package week8.day1;

import week8.day1.enums.*;
import week8.day1.exception.WrongQuantityException;
import week8.day1.models.*;
import week8.day1.utils.Result;
import week8.day1.utils.VMTools;

import java.io.Serializable;
import java.util.HashMap;

public class VendingMachine implements Serializable {
    private HashMap<String, Queue> hashMap = new HashMap<>();

    public VendingMachine() {
        hashMap.put("Coca", new Queue(new Coca()));
        hashMap.put("Fanta", new Queue(new Fanta()));
        hashMap.put("Pepsi", new Queue(new Pepsi()));
        hashMap.put("Sprite", new Queue(new Sprite()));

        hashMap.put("Lays", new Queue(new Lays()));
        hashMap.put("Doritos", new Queue(new Doritos()));
        hashMap.put("Cheetos", new Queue(new Cheetos()));
        hashMap.put("Pringles", new Queue(new Pringles()));

        hashMap.put("Kitkat", new Queue(new Kitkat()));
        hashMap.put("Snickers", new Queue(new Snickers()));
        hashMap.put("Mars", new Queue(new Mars()));
        hashMap.put("Twix", new Queue(new Twix()));

        hashMap.put("Ham", new Queue(new Ham()));
        hashMap.put("Cheese", new Queue(new Cheese()));
        hashMap.put("Club", new Queue(new Club()));
        hashMap.put("Nutella", new Queue(new Nutella()));


    }

    public Result getProduct(Command command) throws WrongQuantityException {
        return initProduct(command);
    }

    private Result initProduct(Command command) throws WrongQuantityException {
        Result result = new Result();
        result.setProducts(getProducts(command));
        return result;
    }

    private Product[] getProducts(Command command) throws WrongQuantityException {
        int quantity = command.getQuantity();
        Product[] products = new Product[quantity];

        if (command.getProductType().equals(ProductType.DRINK)) {
            if (command.getDrinkType().equals(DrinkType.COCA)) {
                products = hashMap.get("Coca").pop(quantity);
                if (hashMap.get("Coca").isEmpty()) {
                    VMTools.refill(hashMap.get("Coca"));
                }
            } else if (command.getDrinkType().equals(DrinkType.PEPSI)) {
                products = hashMap.get("Pepsi").pop(quantity);
                if (hashMap.get("Pepsi").isEmpty()) {
                    VMTools.refill(hashMap.get("Pepsi"));
                }
            } else if (command.getDrinkType().equals(DrinkType.FANTA)) {
                products = hashMap.get("Fanta").pop(quantity);
                if (hashMap.get("Fanta").isEmpty()) {
                    VMTools.refill(hashMap.get("Fanta"));
                }
            } else if (command.getDrinkType().equals(DrinkType.SPRITE)) {
                products = hashMap.get("Sprite").pop(quantity);
                if (hashMap.get("Sprite").isEmpty()) {
                    VMTools.refill(hashMap.get("Sprite"));
                }
            }
        } else if (command.getProductType().equals(ProductType.CHOCOLATE)) {
            if (command.getChocolateType().equals(ChocolateType.KITKAT)) {
                products = hashMap.get("Kitkat").pop(quantity);
                if (hashMap.get("Kitkat").isEmpty()) {
                    VMTools.refill(hashMap.get("Kitkat"));
                }
            } else if (command.getChocolateType().equals(ChocolateType.MARS)) {
                products = hashMap.get("Mars").pop(quantity);
                if (hashMap.get("Mars").isEmpty()) {
                    VMTools.refill(hashMap.get("Mars"));
                }
            } else if (command.getChocolateType().equals(ChocolateType.SNICKERS)) {
                products = hashMap.get("Snickers").pop(quantity);
                if (hashMap.get("Snickers").isEmpty()) {
                    VMTools.refill(hashMap.get("Snickers"));
                }
            } else if (command.getChocolateType().equals(ChocolateType.TWIX)) {
                products = hashMap.get("Twix").pop(quantity);
                if (hashMap.get("Twix").isEmpty()) {
                    VMTools.refill(hashMap.get("Twix"));
                }
            }
        } else if (command.getProductType().equals(ProductType.CHIPS)) {
            if (command.getChipsType().equals(ChipsType.LAYS)) {
                products = hashMap.get("Lays").pop(quantity);
                if (hashMap.get("Lays").isEmpty()) {
                    VMTools.refill(hashMap.get("Lays"));
                }
            } else if (command.getChipsType().equals(ChipsType.PRINGLES)) {
                products = hashMap.get("Pringles").pop(quantity);
                if (hashMap.get("Pringles").isEmpty()) {
                    VMTools.refill(hashMap.get("Pringles"));
                }
            } else if (command.getChipsType().equals(ChipsType.DORITOS)) {
                products = hashMap.get("Doritos").pop(quantity);
                if (hashMap.get("Doritos").isEmpty()) {
                    VMTools.refill(hashMap.get("Doritos"));
                }
            } else if (command.getChipsType().equals(ChipsType.CHEETOS)) {
                products = hashMap.get("Cheetos").pop(quantity);
                if (hashMap.get("Cheetos").isEmpty()) {
                    VMTools.refill(hashMap.get("Cheetos"));
                }
            }
        } else if (command.getProductType().equals(ProductType.SANDWICH)) {
            if (command.getSandwichType().equals(SandwichType.CHEESE)) {
                products = hashMap.get("Cheese").pop(quantity);
                if (hashMap.get("Cheese").isEmpty()) {
                    VMTools.refill(hashMap.get("Cheese"));
                }
            } else if (command.getSandwichType().equals(SandwichType.CLUB)) {
                products = hashMap.get("Club").pop(quantity);
                if (hashMap.get("Club").isEmpty()) {
                    VMTools.refill(hashMap.get("Cheetos"));
                }
            } else if (command.getSandwichType().equals(SandwichType.NUTELLA)) {
                products = hashMap.get("Nutella").pop(quantity);
                if (hashMap.get("Nutella").isEmpty()) {
                    VMTools.refill(hashMap.get("Nutella"));
                }
            } else if (command.getSandwichType().equals(SandwichType.HAM)) {
                products = hashMap.get("Ham").pop(quantity);
                if (hashMap.get("Ham").isEmpty()) {
                    VMTools.refill(hashMap.get("Ham"));
                }
            }
        }
        return products;
    }
}
