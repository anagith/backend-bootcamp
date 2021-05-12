package week3.day3;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkBinStr(scanner.next()));
    }

    public static boolean checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

}
