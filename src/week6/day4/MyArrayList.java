package week6.day4;

import java.util.Arrays;

public class MyArrayList<T> {
    private int capacity;
    private int size;
    private final int DEFAULT_CAPACITY = 5;
    private T[] array;

    public MyArrayList() {
        init(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        init(capacity);
    }

    private void init(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity");
        }
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public boolean add(T element) {
        if (size == capacity) {
            this.expand();
        }
        array[size] = element;
        size++;
        return true;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        } else if (index == size) {
            add(element);
        } else {
            T[] newArray = (T[]) new Object[size + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = element;
            for (int i = index + 1; i < size + 1; i++) {
                newArray[i] = array[i - 1];
            }
            size++;
            array = newArray;
        }
    }

    public boolean remove(T element) {
        int initialSize = this.size;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                for (int j = i; j < this.size - 1; j++) {
                    array[j] = array[j + 1];
                }
                this.size--;
                break;
            }
        }

        if (size < initialSize) {
            return true;
        }
        return false;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        }
        T removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        this.size--;
        return removed;
    }

    public boolean removeAll(T[] toBeRemoved) {
        for (int i = 0; i < toBeRemoved.length; i++) {
            if (this.contains(toBeRemoved[i])) {
                remove(toBeRemoved[i]);
            }
        }
        return true;
    }

    public int indexOf(Integer element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public void swap(int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex >= size || secondIndex >= size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        }
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public void reverse() {
        T temp;
        for (int i = 0; i < size / 2; i++) {
            temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
    }

    public boolean compare(MyArrayList<T> other) {
        if (other.getSize() != this.getSize()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] != other.array[i]) {
                return false;
            }
        }
        return true;
    }

    public void join(MyArrayList<T> other) {
        for (int i = 0; i < other.getSize(); i++) {
            this.add(other.array[i]);
        }
    }

    public MyArrayList<T> clone() {
        MyArrayList<T> clone = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            clone.add(array[i]);
        }
        return clone;
    }

    public int lastIndexOf(Integer element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                index = i;
            }
        }
        return index;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        }
        return array[index];
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    private boolean contains(T element) {
        for (T elem : array) {
            if (elem.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        int difference=capacity-size;
        for (int i=0;i<difference;i++)
        {
            remove(size-1);
        }
    }

    private void expand() {
        capacity = capacity * 3 / 2;
        array = Arrays.copyOf(array, capacity);
    }
}

