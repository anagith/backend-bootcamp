package week1.day3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = fahrenheit / 33.8;
        System.out.println(celsius);

        float floatCelsius = (float) celsius;
        System.out.println(floatCelsius);

        int intCelsius = (int) floatCelsius;
        System.out.println(intCelsius);

    }
}
