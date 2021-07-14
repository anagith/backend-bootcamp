package week6.day1;

import java.util.Arrays;

public class DynamicArray {
    private Object[] array;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public DynamicArray() {
        array = init(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        init(capacity);
    }

    private Object[] init(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity");
        }
        this.capacity = capacity;
        array = new Object[capacity];
        return array;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("illegal index");
        }
        if (array[index] instanceof Integer) {
            return getInteger(array[index]);
        } else if (array[index] instanceof String) {
            return getString(array[index]);
        } else if (array[index] instanceof Double) {
            return getDouble(array[index]);
        } else if (array[index] instanceof Long) {
            return getLong(array[index]);
        }
        return null;
    }

    public boolean add(Object element) {
        if (size == capacity) {
            this.expand();
        }
        array[size] = element;
        size++;
        return true;
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
        capacity = capacity * 3 / 2;
        array = Arrays.copyOf(array, capacity);
    }

    private Object getLong(Object obj) {
        return (Long) obj;
    }

    private Object getDouble(Object obj) {
        return (Double) obj;
    }

    private Object getString(Object obj) {
        return (String) obj;
    }

    private Integer getInteger(Object obj) {
        return (Integer) obj;
    }
}
