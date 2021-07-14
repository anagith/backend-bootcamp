package week3.day3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hasChar(scanner.next(), 'a'));
    }

    public static boolean hasChar(String str, char ch) {
        String str1 = Character.toString(ch);
        return str.contains(str1);
    }

}
