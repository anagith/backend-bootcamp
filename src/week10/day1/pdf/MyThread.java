package week10.day1.pdf;

public class MyThread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("sum is " + calculateSum());
    }

    private long calculateSum() {
        long sum = 0;
        for (int i = 0; i < 5000000; i++) {
            sum += i;
        }
        return sum;
    }
}
