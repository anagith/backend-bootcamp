package week5.day3;

import week5.day3.models.Product;

public class Queue {
    private Product[] arr;
    private final int capacity = 10;
    private int size;

    public Queue() {
        arr = new Product[capacity];
    }

    public Queue(Product product) {
        arr = new Product[capacity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = product;
        }
        size = capacity;
    }


    public void push(Product product) {
        if (size < capacity) {
            arr[size] = product;
            size++;
        }
    }

    public Product get(int index) {
        return arr[index];
    }

    public Product pop() {
        Product product = arr[0];
        if (!isEmpty()) {
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
        return product;
    }

    public Product[] pop(int n) {
        if (n >= size - 1) {
            System.out.println("not enough");
            return null;
        }
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = pop();
        }
        return products;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public Product[] getArr() {
        return arr;
    }

    public boolean isEmpty() {
        if (size == 1) {
            return true;
        }
        return false;
    }
}
