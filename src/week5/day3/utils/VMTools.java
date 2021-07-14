package week5.day3.utils;


import week5.day3.Queue;

public class VMTools {
    public static void refill(Queue productQueue) {
        if (productQueue.getSize() == 1) {
            while (productQueue.getSize() < productQueue.getCapacity()) {
                productQueue.push(productQueue.get(0));
            }
        }
    }
}
