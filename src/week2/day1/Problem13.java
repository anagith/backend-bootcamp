package week2.day1;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double startMileage = scanner.nextDouble();
        double goalMileage = scanner.nextDouble();
        int days = 1;
        if (goalMileage < startMileage) {
            System.out.println("wrong input");
        } else {
            do {
                startMileage += startMileage * 0.1;
                days++;
            }
            while (startMileage <= goalMileage);
        }
        System.out.println(days);
    }
}
