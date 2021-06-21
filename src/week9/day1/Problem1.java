package week9.day1;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        MyClass myClass = new MyClass();
        double sum = myClass.sum(arr, element -> element);
        System.out.println(sum);
        double average = myClass.sum(arr, element -> element / arr.length);
        System.out.println(average);

    }
}
