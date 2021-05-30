package week5.day3;


import week5.day3.enums.*;

public class Command {
    private int quantity;
    private ProductType productType;
    private DrinkType drinkType;
    private ChipsType chipsType;
    private ChocolateType chocolateType;
    private SandwichType sandwichType;

    public Command(String input) {
        String[] split = input.split(":");
        if (split[0].equals("A")) {
            this.productType = ProductType.DRINK;
            chooseDrink(split);
        }
        if (split[0].equals("B")) {
            this.productType = ProductType.CHIPS;
            chooseChips(split);
        }
        if (split[0].equals("C")) {
            this.productType = ProductType.CHOCOLATE;
            chooseChocolate(split);
        }
        if (split[0].equals("D")) {
            this.productType = ProductType.SANDWICH;
            chooseSandwich(split);
        }
        quantity = Integer.parseInt(split[2]);
    }

    public int getQuantity() {
        return quantity;
    }

    private void chooseSandwich(String[] split) {
        if (Integer.parseInt(split[1]) == 1) {
            this.sandwichType = SandwichType.HAM;
        }
        if (Integer.parseInt(split[1]) == 2) {
            this.sandwichType = SandwichType.CHEESE;
        }
        if (Integer.parseInt(split[1]) == 3) {
            this.sandwichType = SandwichType.CLUB;
        }
        if (Integer.parseInt(split[1]) == 4) {
            this.sandwichType = SandwichType.NUTELLA;
        }
    }

    private void chooseChocolate(String[] split) {
        if (Integer.parseInt(split[1]) == 1) {
            this.chocolateType = ChocolateType.KITKAT;
        }
        if (Integer.parseInt(split[1]) == 2) {
            this.chocolateType = ChocolateType.SNICKERS;
        }
        if (Integer.parseInt(split[1]) == 3) {
            this.chocolateType = ChocolateType.MARS;
        }
        if (Integer.parseInt(split[1]) == 1) {
            this.chocolateType = ChocolateType.TWIX;
        }
    }

    private void chooseChips(String[] split) {
        if (Integer.parseInt(split[1]) == 1) {
            this.chipsType = ChipsType.LAYS;
        }
        if (Integer.parseInt(split[1]) == 2) {
            this.chipsType = ChipsType.DORITOS;
        }
        if (Integer.parseInt(split[1]) == 3) {
            this.chipsType = ChipsType.CHEETOS;
        }
        if (Integer.parseInt(split[1]) == 4) {
            this.chipsType = ChipsType.PRINGLES;
        }
    }

    private void chooseDrink(String[] split) {
        if (Integer.parseInt(split[1]) == 1) {
            this.drinkType = DrinkType.COCA;
        }
        if (Integer.parseInt(split[1]) == 2) {
            this.drinkType = DrinkType.FANTA;
        }
        if (Integer.parseInt(split[1]) == 3) {
            this.drinkType = DrinkType.PEPSI;
        }
        if (Integer.parseInt(split[1]) == 4) {
            this.drinkType = DrinkType.SPRITE;
        }
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public ChipsType getChipsType() {
        return chipsType;
    }

    public void setChipsType(ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    public SandwichType getSandwichType() {
        return sandwichType;
    }

    public void setSandwichType(SandwichType sandwichType) {
        this.sandwichType = sandwichType;
    }


}
