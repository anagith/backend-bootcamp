package week3.day5;

public class Problem8 {
    public static void main(String[] args) {
        String str = "fghijkla";
        System.out.println(stringInsertionSort(str));
    }

    public static String stringInsertionSort(String str) {
        for (int i = 1; i < str.length(); i++) {
            char key = str.charAt(i);
            int j = i - 1;
            while (j >= 0 && str.charAt(j) > key) {
                str = str.substring(0, j + 1) + str.charAt(j) + str.substring(j + 2);
                j--;
            }
            str = str.substring(0, j + 1) + key + str.substring(j + 2);
        }
        return str;
    }
}
