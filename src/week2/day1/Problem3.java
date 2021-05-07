package week2.day1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int j = 1;
        if (number >= 1) {
            System.out.print("1" + " ");
        }
        while (i <= number) {
            j = 1;
            while (j <= i / 2) {
                if (i == Math.pow(j, 2)) {
                    System.out.print(i + " ");
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
