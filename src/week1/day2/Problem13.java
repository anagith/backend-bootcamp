package week1.day2;

import java.util.Random;

public class Problem13 {
    public static void main(String[] args) {
        //Generate and print random integer number between 0 to 15
        Random random = new Random();
        int randomNumber = random.nextInt(15);
        System.out.println(randomNumber);

    }
}
