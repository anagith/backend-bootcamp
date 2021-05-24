package week4.day5.factory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("tea")) {
            return new TeaFactory();
        } else if (choice.equalsIgnoreCase("coffee")) {
            return new CoffeeFactory();
        }
        return null;
    }

}
