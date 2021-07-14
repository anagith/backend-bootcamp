package week2.day5;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String result = new String();
        if (word.charAt(0) > 90) {
            result += (char) (word.charAt(0) - 32);
        } else {
            result += (char) word.charAt(0);
        }
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                result += (char) (word.charAt(i) + 32);
            } else {
                result += (char) word.charAt(i);
            }
        }
        System.out.println(result);

    }
}
