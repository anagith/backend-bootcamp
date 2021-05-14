package week3.day4;

public class Problem15 {
    public static void main(String[] args) {
        System.out.println(putBraces("abcdef"));
    }

    public static String putBraces(String str) {
        if (str.length() == 2 || str.length() == 1) {
            return "(" + str + ")";
        }
        return "(" + str.charAt(0) + putBraces(str.substring(1, str.length() - 1)) +
                str.charAt(str.length() - 1) + ")";
    }
}
