package week6.day1;

import java.util.Arrays;

public class GenericDynamicArray<T> {

    private T[] array;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public GenericDynamicArray() {
        init(DEFAULT_CAPACITY);
    }

    public GenericDynamicArray(int capacity) {
        init(capacity);
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Illegal index");
        }
        return array[index];
    }

    public void add(T elem) {
        if(size==capacity)
        {
            expand();
        }
        array[size]=elem;
        size++;
    }
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        }
        Object removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        this.size--;
        shorten();
        return removed;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void shorten() {
        if (size <= capacity / 4 && capacity > 5) {
            capacity /= 2;
        }
    }

    private void expand() {
        capacity=capacity*3/2;
        array= Arrays.copyOf(array,capacity);
    }

    private void init(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity");
        }
        this.capacity = capacity;
        array = (T[]) new Object[10];
    }


}
