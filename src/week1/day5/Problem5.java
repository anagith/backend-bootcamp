package week1.day5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int result = input.equals("") ? 0 : input == null ? -1 : 1;
        System.out.println(result);
    }
}
