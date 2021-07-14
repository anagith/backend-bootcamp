package week1.day3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doubleNum = scanner.nextDouble();
        float floatNum = (float) doubleNum;
        System.out.println(doubleNum + " " + floatNum);

        long longNum = (long) floatNum;
        System.out.println(floatNum + " " + longNum);

        int intNum = (int) longNum;
        System.out.println(longNum + " " + intNum);

        short shortNum = (short) intNum;
        System.out.println(intNum + " " + shortNum);

        byte byteNum = (byte) shortNum;
        System.out.println(shortNum + " " + byteNum);

    }
}
