package week5.day2;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;
    private int size;
    private final int DEFAULT_CAPACITY = 5;
    private Integer[] array;

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
        this.array = new Integer[capacity];
    }

    public boolean add(Integer element) {
        if (size == capacity) {
            this.expand();
        }
        array[size] = element;
        size++;
        return true;
    }

    public void add(int index, Integer element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        } else if (index == size) {
            add(element);
        } else {
            Integer[] newArray = new Integer[size + 1];
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


    public boolean remove(Integer element) {
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
        shorten();

        if (size < initialSize) {
            return true;
        }
        return false;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        }
        Integer removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        this.size--;
        shorten();
        return removed;
    }

    public boolean removeAll(Integer[] toBeRemoved) {
        for (int i = 0; i < toBeRemoved.length; i++) {
            if (this.contains(toBeRemoved[i])) {
                remove(toBeRemoved[i]);
            }
        }
        shorten();
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
        Integer temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
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

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("illegal index");
        }
        return array[index];
    }


    private boolean contains(Integer element) {
        for (Integer integer : array) {
            if (integer.equals(element)) {
                return true;
            }
        }
        return false;
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
}
