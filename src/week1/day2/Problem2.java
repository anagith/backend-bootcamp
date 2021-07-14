package week1.day2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        //Convert minutes into a number of hours,print count of hours and minutes.
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int hours = input / 60;
        int minutes = input % 60;
        System.out.println(hours);
        System.out.println(minutes);
    }
}
