package week2.day5;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int hours = input / 60;
        int minutes = input % 60;
        if (hours % 24 == 0) {
            hours = 0;
        }
        System.out.print(hours + " " + minutes);
    }
}
