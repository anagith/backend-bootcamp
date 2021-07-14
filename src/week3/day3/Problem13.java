package week3.day3;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstNonDuplicate(scanner.next()));
    }

    public static char firstNonDuplicate(String str) {
        int countOfDuplicate = 0;
        for (int i = 0; i < str.length(); i++) {
            countOfDuplicate = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    countOfDuplicate++;
                }
            }
            if (countOfDuplicate == 0) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
