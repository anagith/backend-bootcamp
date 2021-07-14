package week8.day1.utils;


import week8.day1.Queue;

public class VMTools {
    public static void refill(Queue productQueue) {
        if (productQueue.getSize() == 1) {
            while (productQueue.getSize() < productQueue.getCapacity()) {
                productQueue.push(productQueue.get(0));
            }
        }
    }
}
