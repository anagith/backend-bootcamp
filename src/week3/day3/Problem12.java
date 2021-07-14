package week3.day3;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countDuplicates(scanner.next()));
    }

    static public int countDuplicates(String str) {
        int countOfDuplicates = 0;
        int countOfUnique = 0;
        for (int i = 0; i < str.length(); i++) {
            countOfDuplicates = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    countOfDuplicates++;
                }
            }
            if (countOfDuplicates == 0) {
                countOfUnique++;
            }
        }
        return str.length() - countOfUnique;
    }
}
