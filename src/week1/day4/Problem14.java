package week1.day4;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEdge = scanner.nextInt();
        int secondEdge = scanner.nextInt();
        int thirdEdge = scanner.nextInt();
        if (firstEdge + secondEdge > thirdEdge) {
            if (firstEdge + thirdEdge > secondEdge) {
                if (secondEdge + thirdEdge > firstEdge) {
                    System.out.println("is a triangle");
                } else {
                    System.out.println("is not a triangle");
                }
            } else {
                System.out.println("is not a triangle");
            }
        } else {
            System.out.println("is not a triangle");
        }
    }
}
