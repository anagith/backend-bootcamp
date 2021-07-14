package week1.day5;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        if (first == second) {
            System.out.println("strings are ==");
        } else if (first.equals(second)) {
            System.out.println("strings are equal");
        }
    }
}
