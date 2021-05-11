package week3.day2;

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(search(arr));
        System.out.println(search(arr, 2));
        System.out.println(search(arr, 2, 1));
    }

    public static int search(int[] arr) {
        return arr.length;
    }

    public static int search(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] arr, int element, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element && i == index) {
                return true;
            }
        }
        return false;
    }
}
