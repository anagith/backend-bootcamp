package week4.day3;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {5, 46, 17, -2};
        System.out.println(find(arr, 36));
    }

    public static int find(int[] arr, int key) {
        int difference = Math.abs(Math.abs(arr[0]) - key);
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
            if (Math.abs(Math.abs(arr[i]) - key) < difference) {
                difference = Math.abs(Math.abs(arr[i]) - key);
                index = i;
            }
        }
        return index;
    }
}
