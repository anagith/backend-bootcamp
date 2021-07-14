package week3.day4;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static String reverse(String str) {
        if (str.length() == 0) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
