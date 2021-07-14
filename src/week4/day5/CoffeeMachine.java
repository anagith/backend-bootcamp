package week4.day5;

import week4.day5.factory.AbstractFactory;
import week4.day5.factory.FactoryCreator;
import week4.day5.models.*;

public class CoffeeMachine {

    public Cup getProduct(Command command) {
        return initializeProduct(command);
    }

    private Cup initializeProduct(Command command) {
        Cup cup = new Cup();
        cup.setDrink(makeDrink(command));
        if (checkStick(command)) {
            cup.setStick(new Stick());
        }
        cup.setSugars(addSugar(command));
        return cup;
    }

    private Drink makeDrink(Command command) {
        if (DrinkType.TEA == command.getDrinkType()) {
            AbstractFactory teaFactory = FactoryCreator.getFactory("tea");
            return teaFactory.getTea(command);
        }
        AbstractFactory coffeeFactory = FactoryCreator.getFactory("coffee");
        return coffeeFactory.getCoffee(command);
    }

    private boolean checkStick(Command command) {
        if (command.getSugarCount() == 0) {
            return false;
        }
        return true;
    }

    private Sugar[] addSugar(Command command) {
        Sugar[] sugars = new Sugar[command.getSugarCount()];
        for (int i = 0; i < command.getSugarCount(); i++) {
            sugars[i] = new Sugar();
        }
        return sugars;
    }

}
