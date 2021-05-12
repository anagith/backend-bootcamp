package week3.day3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(charAt(scanner.next(), 2));
    }

    public static char charAt(String str, int index) {
        return str.charAt(index);
    }
}
