package week1.day2;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        /*-Write a java program to calculate the square of a
           -right-angled triangle
           -square
           -rectangle*/
        Scanner scanner = new Scanner(System.in);
        int firstLeg = scanner.nextInt();
        int secondLeg = scanner.nextInt();
        int rightAngledTriangle = firstLeg * secondLeg / 2;
        System.out.println(rightAngledTriangle);

        int squareEdge = scanner.nextInt();
        int square = squareEdge * squareEdge;
        System.out.println(square);

        int firstEdge = scanner.nextInt();
        int secondEdge = scanner.nextInt();
        int rectangle = firstEdge * secondEdge;
        System.out.println(rectangle);

    }
}
