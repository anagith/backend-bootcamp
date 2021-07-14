package week3.day4;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(101));
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
