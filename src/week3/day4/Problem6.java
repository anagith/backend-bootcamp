package week3.day4;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(computeNumberOfx("xxsx"));
    }

    public static int computeNumberOfx(String str) {
        int count = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            count = 1;
        }
        return count + computeNumberOfx(str.substring(0, str.length() - 1));
    }
}
