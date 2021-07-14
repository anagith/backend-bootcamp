package week4.day5.factory;

import week4.day5.Command;
import week4.day5.models.Coffee;
import week4.day5.models.DrinkType;
import week4.day5.models.Tea;

public class CoffeeFactory extends AbstractFactory {

    @Override
    public Tea getTea(Command command) {
        return null;
    }

    @Override
    public Coffee getCoffee(Command command) {
        if (DrinkType.COFFEE == command.getDrinkType()) {
            return new Coffee();
        }
        return null;
    }
}
