package week10.day1.sum;

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        long start = System.nanoTime();
        myThread1.start();
        myThread2.start();
        long end = System.nanoTime();
        System.out.println(end - start);
    }

}
