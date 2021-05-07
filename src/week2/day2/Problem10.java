package week2.day2;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.next();
        int length = binary.length();
        int decimal = 0;
        for (int i = length - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, length - i - 1);
        }
        System.out.println(decimal);
    }
}
