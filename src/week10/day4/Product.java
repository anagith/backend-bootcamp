package week10.day4;

public class Product {
    private int value;
    private volatile boolean producible = true;

    synchronized void setValue(int value) {
        while (!producible) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.value = value;
        producible = false;
        notify();
    }

    synchronized int getValue() {
        while (producible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        producible = true;
        notify();
        return value;
    }
}
