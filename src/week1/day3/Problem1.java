package week1.day3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte nextByte = scanner.nextByte();
        short shortNum = nextByte;
        System.out.println(nextByte + " " + shortNum);

        int intNum = shortNum;
        System.out.println(shortNum + " " + intNum);

        long longNum = intNum;
        System.out.println(intNum + " " + longNum);

        float floatNum = longNum;
        System.out.println(longNum + " " + floatNum);

        double doubleNum = floatNum;
        System.out.println(floatNum + " " + doubleNum);

    }
}
