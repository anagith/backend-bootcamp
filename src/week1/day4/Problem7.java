package week1.day4;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int retain = input % 7;
        if (retain == 0) {
            System.out.println("Sunday");
        } else if (retain == 1) {
            System.out.println("Monday");
        } else if (retain == 2) {
            System.out.println("Tuesday");
        } else if (retain == 3) {
            System.out.println("Wednesday");
        } else if (retain == 4) {
            System.out.println("Thursday");
        } else if (retain == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
    }
}
