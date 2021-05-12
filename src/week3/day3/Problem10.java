package week3.day3;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isHex(scanner.next()));
    }

    public static boolean isHex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) > '0' && str.charAt(i) < '9'
                    || str.charAt(i) >= 65 && str.charAt(i) <= 70
                    || str.charAt(i) >= 97 && str.charAt(i) <= 102)) {
                return false;
            }
        }
        return true;
    }
}
