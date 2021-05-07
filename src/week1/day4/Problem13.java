package week1.day4;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstAbscissa = scanner.nextDouble();
        double firstOrdinate = scanner.nextDouble();
        double secondAbscissa = scanner.nextDouble();
        double secondOrdinate = scanner.nextDouble();
        if (firstAbscissa == 0 || firstOrdinate == 0 || secondAbscissa == 0 || secondOrdinate == 0) {
            System.out.println("Please enter non zero coordinates");
        } else if (firstAbscissa > 0 && secondAbscissa > 0) {
            if (firstOrdinate > 0 && secondOrdinate > 0) {
                System.out.println("in the same plane");
            } else if (firstOrdinate < 0 && secondOrdinate < 0) {
                System.out.println("in the same plane");
            } else {
                System.out.println("not in the same plane");
            }
        } else if (firstAbscissa < 0 && secondAbscissa < 0) {
            if (firstOrdinate > 0 && secondOrdinate > 0) {
                System.out.println("in the same plane");
            } else if (firstOrdinate < 0 && secondOrdinate < 0) {
                System.out.println("in the same plane");
            } else {
                System.out.println("not in the same plane");
            }
        } else {
            System.out.println("not in the same plane");
        }
    }
}
