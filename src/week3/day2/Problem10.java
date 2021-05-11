package week3.day2;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println(remainder(123));
        System.out.println(remainder(123, 3));
    }

    public static int remainder(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int remainder(int n, int r) {
        return remainder(n) % r;
    }
}
