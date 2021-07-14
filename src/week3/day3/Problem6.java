package week3.day3;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countVowelDigit(scanner.next());
    }

    public static void countVowelDigit(String str) {
        int digitCount = 0;
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digitCount++;
            }
            if (str.charAt(i) == 'a' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'I' || str.charAt(i) == 'U' || str.charAt(i) == 'E') {
                vowelCount++;
            }
        }
        double digitPercentage = (double) digitCount / str.length() * 100;
        double vowelPercentage = (double) vowelCount / str.length() * 100;
        System.out.println("Number of vowels: " + vowelCount + "(" + String.format("%.2f", vowelPercentage) + ")" + "%");
        System.out.println("Number of digits: " + digitCount + "(" + String.format("%.2f", digitPercentage) + ")" + "%");

    }
}
