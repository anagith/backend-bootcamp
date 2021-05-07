package week2.day2;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 1; ; i++) {
            if (count != 0) {
                for (int j = 1; j <= i; j++) {
                    if (count == 0) {
                        break;
                    }
                    System.out.print(i + " ");
                    count--;
                }
            }
        }
    }
}
