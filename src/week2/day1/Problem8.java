package week2.day1;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean isPowOfTwo = false;
        do {
            int input = scanner.nextInt();
            count++;
            while (input > 1) {
                if (input % 2 == 0) {
                    input /= 2;
                } else {
                    break;
                }
            }
            if (input == 1) {
                isPowOfTwo = true;
            }
        }
        while (!isPowOfTwo);
        System.out.println(count);
    }
}
