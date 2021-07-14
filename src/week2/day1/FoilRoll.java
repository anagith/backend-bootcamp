package week2.day1;

import java.util.Scanner;

public class FoilRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foilThickness = 0.0025;
        double diameter = 4;
        int length = scanner.nextInt();
        while (length >= Math.PI * diameter) {
            double rollLength = Math.PI * diameter;
            length -= rollLength;
            diameter += 2 * foilThickness;
        }
        System.out.println((float) diameter);
    }
}
