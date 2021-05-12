package week3.day3;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(caesarCode(scanner.next(), scanner.nextInt()));
    }

    public static String caesarCode(String str, int n) {
        str = str.toUpperCase();
        n = n % 26;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 65 && stringBuilder.charAt(i) < 90 - n) {
                stringBuilder.replace(i, i + 1, String.valueOf((char) (str.charAt(i) + n)));
            } else {
                stringBuilder.replace(i, i + 1, String.valueOf((char) (str.charAt(i) - 90 + n + 65)));
            }
        }
        return stringBuilder.toString();
    }
}
