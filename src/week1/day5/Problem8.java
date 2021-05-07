package week1.day5;

import java.io.IOException;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char choice = (char) System.in.read();
        System.out.print(choice + " is a ");
        switch (choice) {
            case 'A': case 'a':
            case 'I': case 'i':
            case 'O': case 'o':
            case 'E': case 'e':
            case 'U': case 'u': {
            System.out.println("vowel");
            break;
        }
            default: {
                System.out.println("consonant");
            }
        }
    }
}
