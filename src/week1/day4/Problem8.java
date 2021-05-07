package week1.day4;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfIceCream = scanner.nextInt();
        if (countOfIceCream < 0) {
            System.out.println("Please enter a positive number ");
        } else if (countOfIceCream < 3 || countOfIceCream == 7) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
