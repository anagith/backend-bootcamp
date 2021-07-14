package week2.day1;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println(1);
        } else {
            int current = 1;
            int next = 1;
            int temp;
            int count = 2;
            do {
                temp = current + next;
                current = next;
                next = temp;
                count++;
            }
            while (temp < input);
            if (temp == input) {
                System.out.println(count);
            } else {
                System.out.println("-1");
            }
        }
    }
}
