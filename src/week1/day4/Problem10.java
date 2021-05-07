package week1.day4;

import java.util.Random;

public class Problem10 {

    public static void main(String[] args) {
        int number = new Random().nextInt();
        boolean flag = false;
        if (number > -1000 && number < 1000) {
            if (number % 3 == 0 || number % 5 == 0) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
