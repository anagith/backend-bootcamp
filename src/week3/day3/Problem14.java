package week3.day3;

import java.io.IOException;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countOccurrences(scanner.next(), (char) System.in.read()));
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
