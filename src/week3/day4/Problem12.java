package week3.day4;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println(largestDigit("13978"));
    }

    public static char largestDigit(String str) {
        if (str.length() == 1) {
            return str.charAt(0);
        }
        if (str.charAt(0) > largestDigit(str.substring(1))) {
            return str.charAt(0);
        }
        return largestDigit(str.substring(1));
    }
}
