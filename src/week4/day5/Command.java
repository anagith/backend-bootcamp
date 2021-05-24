package week4.day5;

import week4.day5.models.DrinkType;

public class Command {
    private DrinkType drinkType;
    private int sugarCount;

    public Command(String input) {
        String[] split = input.split(":");
        if (split[0].equals("T")) {
            this.drinkType = DrinkType.TEA;
        }
        if (split[0].equals("C")) {
            this.drinkType = DrinkType.COFFEE;
        }

        this.sugarCount = Integer.parseInt(split[1]);
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }
}
