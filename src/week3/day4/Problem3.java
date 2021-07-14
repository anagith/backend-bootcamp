package week3.day4;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(computeNumberOfBlocks(4));
    }

    public static int computeNumberOfBlocks(int n) {
        if (n == 0) {
            return 0;
        }
        return n + computeNumberOfBlocks(n - 1);
    }

}
