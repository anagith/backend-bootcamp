package week3.day3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalculateStringLength(scanner.next()));
    }

    public static int CalculateStringLength(String str) {
        return str.length();
    }
}
