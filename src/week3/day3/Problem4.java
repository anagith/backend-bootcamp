package week3.day3;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countOfVowels(scanner.next()));
        System.out.println(countOfConsonants(scanner.next()));
    }

    public static int countOfVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'I' || str.charAt(i) == 'U' || str.charAt(i) == 'E') {
                count++;
            }
        }
        return count;
    }

    public static int countOfConsonants(String str) {
        return str.length() - countOfVowels(str);
    }
}
