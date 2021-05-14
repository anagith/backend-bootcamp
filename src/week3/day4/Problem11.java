package week3.day4;

public class Problem11 {
    static int k = 2;

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }


    public static boolean isPrime(int n) {
        if (n % k == 0 && n!=k) {
            return false;
        }
        if (n == k) {
           return true;
        }
        k++;
        return isPrime(n);
    }
}
