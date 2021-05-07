package week1.day2;

import java.util.Random;

public class Problem14 {
    public static void main(String[] args) {
        //Generate and print random integer number between 15 to 30
        Random random = new Random();
        int randomNumber = 15 + random.nextInt(15);
        System.out.println(randomNumber);
    }
}
