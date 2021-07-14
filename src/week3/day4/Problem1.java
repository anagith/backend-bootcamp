package week3.day4;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sumOfArr(arr, arr.length));
        System.out.println(factorial(5));
    }

    public static int sumOfArr(int[] arr, int size) {
        if (size == 1) {
            return arr[0];
        }
        return sumOfArr(arr, size - 1) + arr[size - 1];
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
