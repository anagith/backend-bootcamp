package week1.day4;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        if (Math.abs(number) < 1) {
            System.out.println("small");
        } else if (Math.abs(number) > 1000000) {
            System.out.println("large");
        }
    }
}
