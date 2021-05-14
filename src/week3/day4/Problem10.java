package week3.day4;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println(cleanString("abbbcdd"));
    }

    public static String cleanString(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return cleanString(str.substring(1));
        }
        return str.charAt(0) + cleanString(str.substring(1));
    }
}
