package week3.day1;

import java.io.IOException;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char ch = (char) System.in.read();
        System.out.println(isVowel(ch));

    }

    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'A':
            case 'a':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            case 'E':
            case 'e': {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}
