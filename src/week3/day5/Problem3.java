package week3.day5;

public class Problem3 {
    public static void main(String[] args) {
        int n = 1000;
        String[] arr = {"abc", "def", "afe", "klf"};
        print(arr);
        bubbleSort(arr);
        print(arr);
    }

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(String[] arr) {
        for (String j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
