package week2.day1;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        int percent = scanner.nextInt();
        int contribution = scanner.nextInt();
        int years = 0;
        double increase;
        do {

            increase = (double) deposit * percent / 100;
            deposit += (int) increase;
            years++;
        }
        while (deposit <= contribution);
        System.out.println(years);
    }
}
