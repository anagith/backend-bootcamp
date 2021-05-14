package week3.day4;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println(moveXToEnd("xklxyur"));
    }

    public static String moveXToEnd(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) != 'x') {
            return str.charAt(0) + moveXToEnd(str.substring(1));
        } else {
            return moveXToEnd(str.substring(1)) + str.charAt(0);
        }
    }
}
