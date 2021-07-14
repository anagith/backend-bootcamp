package week4.day5.models;

import java.util.Arrays;

public class Cup {

    private Drink drink;
    private Sugar[] sugars;
    private Stick stick;



    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Sugar[] getSugars() {
        return sugars;
    }

    public void setSugars(Sugar[] sugars) {
        this.sugars = sugars;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }
    @Override
    public String toString() {
        return "Cup{" +
                "drink=" + drink +
                ", sugars=" + Arrays.toString(sugars) +
                ", stick=" + stick +
                '}';
    }
}
