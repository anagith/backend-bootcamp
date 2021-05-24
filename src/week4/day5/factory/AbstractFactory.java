package week4.day5.factory;

import week4.day5.Command;
import week4.day5.models.Coffee;
import week4.day5.models.Tea;

public abstract class AbstractFactory {
    public abstract Tea getTea(Command command);
    public abstract Coffee getCoffee(Command command);
}
