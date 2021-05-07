package week1.day4;

import java.util.Random;

public class Problem3 {
    public static void main(String[] args) {
        int random = new Random().nextInt();
        if (random < 0) {
            random = -random;
        }
        int number = 2 + (random % 6);
        System.out.println(number);
    }
}
