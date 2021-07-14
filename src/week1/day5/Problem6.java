package week1.day5;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int result = first > second ? first > third ? first : second :
                second > third ? second : third;
        System.out.println(result);
    }
}
