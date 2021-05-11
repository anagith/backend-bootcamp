package week3.day2;

public class Problem4 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        double[] doubles = {4, 5, 6};
        float[] floats = {7, 8, 9};
        printArray(ints);
        printArray(doubles);
        printArray(floats);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }

    public static void printArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }

    public static void printArray(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }
}
