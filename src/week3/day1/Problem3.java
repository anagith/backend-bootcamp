package week3.day1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        System.out.println(xor(a, b));
    }

    public static boolean xor(boolean a, boolean b) {
        if ((!(a & b)) && (a | b)) {
            return true;
        }
        return false;
    }
}
