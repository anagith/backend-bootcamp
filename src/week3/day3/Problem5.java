package week3.day3;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = scanner.next();
        System.out.println("The reverse of the string " + str + " is " + reverseString(str));

    }

    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
