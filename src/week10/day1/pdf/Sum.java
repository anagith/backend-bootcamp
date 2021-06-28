package week10.day1.pdf;

public class Sum {
    public static void main(String[] args) {
        long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
