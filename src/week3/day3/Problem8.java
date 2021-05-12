
package week3.day3;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.next()));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(String.valueOf(sb.reverse()));
    }
}
