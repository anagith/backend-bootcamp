package week3.day1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = scanner.nextBoolean();
        boolean y = scanner.nextBoolean();
        boolean z = scanner.nextBoolean();
        System.out.println(election(x, y, z));
    }

    public static boolean election(boolean x, boolean y, boolean z) {
        if (x) {
            if (y || z) {
                return true;
            }
            return false;
        } else {
            if (!(y && z)) {
                return false;
            }
            return true;
        }
    }

}
