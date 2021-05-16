package week3.day5;

public class Problem4 {
    public static void main(String[] args) {
        int n = 1000;
        String[] arr = {"abc", "def", "afe", "klf"};
        print(arr);
        bubbleSortRecursion(arr, 4);
        print(arr);
    }

    public static void bubbleSortRecursion(String[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                String temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        bubbleSortRecursion(arr, n - 1);
    }

    public static void print(String[] arr) {
        for (String j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
