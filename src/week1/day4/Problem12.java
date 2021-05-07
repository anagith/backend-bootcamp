package week1.day4;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first > second && second > 0) {
            if (first % 7 == 0 || second % 7 == 0) {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}
