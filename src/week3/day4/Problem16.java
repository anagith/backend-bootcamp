package week3.day4;

public class Problem16 {
    public static void main(String[] args) {
        System.out.println(mirroredBraces("(abc(def(g"));
    }

    public static String mirroredBraces(String str) {
        if (str.length() == 1) {
            return str + str.charAt(0);
        }
        if (str.charAt(0) == '(') {
            return str.charAt(0) + mirroredBraces(str.substring(1)) + ")";
        }
        return str.charAt(0) + mirroredBraces(str.substring(1)) + str.charAt(0);
    }
}
