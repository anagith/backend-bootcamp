package week4.day5.factory;

import week4.day5.Command;
import week4.day5.models.Coffee;
import week4.day5.models.DrinkType;
import week4.day5.models.Tea;

public class TeaFactory extends AbstractFactory {

    @Override
    public Tea getTea(Command command) {
        if (DrinkType.TEA == command.getDrinkType()) {
            return new Tea();
        }
        return null;
    }

    @Override
    public Coffee getCoffee(Command command) {
        return null;
    }
}
