package week3.day4;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(countOfDigitSeven(717));
    }

    public static int countOfDigitSeven(int n) {
        if (n <= 9) {
            if (n == 7) {
                return 1;
            } else {
                return 0;
            }
        }
        return countOfDigitSeven(n % 10) + countOfDigitSeven(n / 10);
    }
}
