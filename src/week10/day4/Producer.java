package week10.day4;

public class Producer extends Thread {
    private final Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            synchronized (product) {
                product.setValue(i);
                System.out.println(i + " produced ");
            }
        }
    }
}
