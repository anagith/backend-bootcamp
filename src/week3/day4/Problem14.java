package week3.day4;

public class Problem14 {
    public static void main(String[] args) {
        System.out.println(putAsterisks("Lil"));
    }

    public static String putAsterisks(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(0) + "*" + putAsterisks(str.substring(1));
    }
}
