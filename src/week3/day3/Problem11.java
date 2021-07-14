package week3.day3;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(bin2Dec(scanner.next()));
    }

    public static int bin2Dec(String str) {
        int dec = 0;
        int remain = 0;
        int number = Integer.parseInt(str);
        for (int i = 0; i < str.length(); i++) {
            remain = number % 10;
            dec += remain * Math.pow(2, i);
            number /= 10;
        }
        return dec;
    }
}
