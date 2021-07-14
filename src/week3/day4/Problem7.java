package week3.day4;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(removeX("axaxdasx"));
    }

    public static String removeX(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) != 'x') {
            return str.charAt(0) + removeX(str.substring(1));
        }
        return removeX(str.substring(1));
    }
}
