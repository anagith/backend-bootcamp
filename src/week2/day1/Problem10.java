package week2.day1;

public class Problem10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 32; i < 122; i++) {
            System.out.print((char) i + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
