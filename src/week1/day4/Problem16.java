package week1.day4;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Doesn't have real decisions");
        } else {
            double firstDecision = (-b - Math.sqrt(discriminant)) / 2 * a;
            double secondDecision = (-b + Math.sqrt(discriminant)) / 2 * a;
            System.out.println(firstDecision + " " + secondDecision);
        }
    }
}
