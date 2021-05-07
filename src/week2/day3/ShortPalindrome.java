package week2.day3;

import java.util.Scanner;

public class ShortPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String newstr = new String(str);
        StringBuilder string = new StringBuilder(str);
        StringBuilder copy = new StringBuilder(string.toString());
        StringBuilder reversedString = new StringBuilder(copy.reverse());
        if (string.toString().equals(reversedString.toString())) {
            System.out.println(string);
        } else {

            StringBuilder rightPalindrome = new StringBuilder(str);
            int length = rightPalindrome.length();
            for (int i = 1; i < length; i++) {
                StringBuilder right = new StringBuilder(rightPalindrome.substring(i, length));
                StringBuilder copyForReverse = new StringBuilder(right.toString());
                StringBuilder reversed = new StringBuilder(copyForReverse.reverse());
                if (right.toString().equals(reversed.toString())) {
                    StringBuilder left = new StringBuilder(rightPalindrome.substring(0, i));
                    left.reverse();
                    rightPalindrome.append(left);
                    break;
                }
            }

            StringBuilder leftPalindrome = new StringBuilder(newstr);
            for (int i = length - 1; i > 0; i--) {
                StringBuilder left = new StringBuilder(leftPalindrome.substring(0, i));
                StringBuilder copyForReverse = new StringBuilder(left.toString());
                StringBuilder reversed = new StringBuilder(copyForReverse.reverse());
                if (left.toString().equals(reversed.toString())) {
                    StringBuilder right = new StringBuilder(leftPalindrome.substring(i, length));
                    right.reverse();
                    leftPalindrome.insert(0, right);
                    break;
                }
            }

            if (rightPalindrome.length() < leftPalindrome.length()) {
                System.out.println(rightPalindrome);
            } else {
                System.out.println(leftPalindrome);
            }
        }
    }
}
