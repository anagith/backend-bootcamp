package week3.day4;

public class Problem13 {
    public static void main(String[] args) {
        System.out.println(computeNumberOfDigits("Aa234a"));
    }

    public static int computeNumberOfDigits(String str) {
        int count = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) <= '9' && str.charAt(0) >= '0') {
            count = 1;
        }
        return count + computeNumberOfDigits(str.substring(1));
    }
}
