package week5.day3;

import week5.day3.enums.*;
import week5.day3.exception.WrongQuantityException;
import week5.day3.models.*;
import week5.day3.utils.Result;
import week5.day3.utils.VMTools;

public class VendingMachine {
    private Queue coca = new Queue(new Coca());
    private Queue fanta = new Queue(new Fanta());
    private Queue pepsi = new Queue(new Pepsi());
    private Queue sprite = new Queue(new Sprite());

    private Queue lays = new Queue(new Lays());
    private Queue doritos = new Queue(new Doritos());
    private Queue cheetos = new Queue(new Cheetos());
    private Queue pringles = new Queue(new Pringles());

    private Queue kitkat = new Queue(new Kitkat());
    private Queue snickers = new Queue(new Snickers());
    private Queue mars = new Queue(new Mars());
    private Queue twix = new Queue(new Twix());

    private Queue ham = new Queue(new Ham());
    private Queue cheese = new Queue(new Cheese());
    private Queue club = new Queue(new Club());
    private Queue nutella = new Queue(new Nutella());


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
                products = coca.pop(quantity);
                if (coca.isEmpty()) {
                    VMTools.refill(coca);
                }
            } else if (command.getDrinkType().equals(DrinkType.PEPSI)) {
                products = pepsi.pop(quantity);
                if (pepsi.isEmpty()) {
                    VMTools.refill(pepsi);
                }
            } else if (command.getDrinkType().equals(DrinkType.FANTA)) {
                products = fanta.pop(quantity);
                if (fanta.isEmpty()) {
                    VMTools.refill(fanta);
                }
            } else if (command.getDrinkType().equals(DrinkType.SPRITE)) {
                products = sprite.pop(quantity);
                if (sprite.isEmpty()) {
                    VMTools.refill(sprite);
                }
            }
        } else if (command.getProductType().equals(ProductType.CHOCOLATE)) {
            if (command.getChocolateType().equals(ChocolateType.KITKAT)) {
                products = kitkat.pop(quantity);
                if (kitkat.isEmpty()) {
                    VMTools.refill(kitkat);
                }
            } else if (command.getChocolateType().equals(ChocolateType.MARS)) {
                products = mars.pop(quantity);
                if (mars.isEmpty()) {
                    VMTools.refill(mars);
                }
            } else if (command.getChocolateType().equals(ChocolateType.SNICKERS)) {
                products = snickers.pop(quantity);
                if (snickers.isEmpty()) {
                    VMTools.refill(snickers);
                }
            } else if (command.getChocolateType().equals(ChocolateType.TWIX)) {
                products = twix.pop(quantity);
                if (twix.isEmpty()) {
                    VMTools.refill(twix);
                }
            }
        } else if (command.getProductType().equals(ProductType.CHIPS)) {
            if (command.getChipsType().equals(ChipsType.LAYS)) {
                products = lays.pop(quantity);
                if (lays.isEmpty()) {
                    VMTools.refill(lays);
                }
            } else if (command.getChipsType().equals(ChipsType.PRINGLES)) {
                products = pringles.pop(quantity);
                if (pringles.isEmpty()) {
                    VMTools.refill(pringles);
                }
            } else if (command.getChipsType().equals(ChipsType.DORITOS)) {
                products = doritos.pop(quantity);
                if (doritos.isEmpty()) {
                    VMTools.refill(doritos);
                }
            } else if (command.getChipsType().equals(ChipsType.CHEETOS)) {
                products = cheetos.pop(quantity);
                if (cheetos.isEmpty()) {
                    VMTools.refill(cheetos);
                }
            }
        } else if (command.getProductType().equals(ProductType.SANDWICH)) {
            if (command.getSandwichType().equals(SandwichType.CHEESE)) {
                products = cheese.pop(quantity);
                if (cheese.isEmpty()) {
                    VMTools.refill(cheese);
                }
            } else if (command.getSandwichType().equals(SandwichType.CLUB)) {
                products = club.pop(quantity);
                if (club.isEmpty()) {
                    VMTools.refill(club);
                }
            } else if (command.getSandwichType().equals(SandwichType.NUTELLA)) {
                products = nutella.pop(quantity);
                if (nutella.isEmpty()) {
                    VMTools.refill(nutella);
                }
            } else if (command.getSandwichType().equals(SandwichType.HAM)) {
                products = ham.pop(quantity);
                if (ham.isEmpty()) {
                    VMTools.refill(ham);
                }
            }
        }
        return products;
    }
}
