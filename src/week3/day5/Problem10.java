package week3.day5;

public class Problem10 {
    public static void main(String[] args) {
        String str = "cdfe";
        System.out.println(sortAndFindChar(str, 'e'));
    }
    public static int sortAndFindChar(String str, char ch) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}
