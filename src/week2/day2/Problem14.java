package week2.day2;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input < 0) {
            input = scanner.nextInt();
        }
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
