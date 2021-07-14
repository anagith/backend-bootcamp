package week1.day3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;
        System.out.println(area + " " + perimeter);
    }
}
