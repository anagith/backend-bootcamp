package week6.day5;

import week6.day4.MyArrayList;

import java.util.NoSuchElementException;

public class MyArrayDeque<T> implements MyDeque<T> {
    private MyArrayList<T> arrayList;

    public MyArrayDeque() {
        arrayList = new MyArrayList<>();
    }

    public MyArrayDeque(int number) {
        if (number < 1) {
            arrayList = new MyArrayList<>(1);
        }
        arrayList = new MyArrayList<>(number);
    }


    @Override
    public void addFirst(T obj) {
        if (obj == null) {
            throw new NullPointerException("Can't add null");
        } else {
            arrayList.add(0, obj);
        }
    }

    @Override
    public void addLast(T obj) {
        if (obj == null) {
            throw new NullPointerException("Can't add null");
        }
        arrayList.add(obj);

    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("No element");
        }
        return arrayList.get(0);
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("No element");
        }
        return arrayList.get(arrayList.getSize() - 1);
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("No element");
        }
        arrayList.remove(0);
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("No element");
        }
        arrayList.remove(arrayList.getSize() - 1);
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }

    private boolean isEmpty() {
        if (arrayList.getSize() == 0) {
            return true;
        }
        return false;
    }

}
