package week10.day4;

public class Consumer extends Thread {
    private final Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        int value=1;
        while (value!=9){
            synchronized (product) {
                value = product.getValue();
                System.out.println(value + " consumed ");
            }
        }
    }
}
