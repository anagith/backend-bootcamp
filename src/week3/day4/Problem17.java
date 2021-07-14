package week3.day4;

public class Problem17 {
    public static void main(String[] args) {
        System.out.println(removeSymmetricChars("abbcdabba"));
    }

    public static String removeSymmetricChars(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return str.charAt(0) + removeSymmetricChars(str.substring(1, str.length() - 1))
                    + str.charAt(str.length() - 1);
        }
        return removeSymmetricChars(str.substring(1, str.length() - 1));
    }
}
