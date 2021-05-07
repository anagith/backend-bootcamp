package week1.day5;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number > 0 ? "positive" : "negative";
        System.out.println(result);
        result = number >= 0 ? (number == 0 ? "zero" : "positive") : "negative";
        System.out.println(result);
    }
}
