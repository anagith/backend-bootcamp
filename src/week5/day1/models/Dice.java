package week5.day1.models;

import java.util.Random;

public class Dice {
    public static int throwDice() {
        Random random = new Random();
        return random.nextInt(6);
    }

}
