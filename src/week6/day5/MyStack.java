package week6.day5;

import week6.day4.MyArrayList;

public class MyStack<T> {
    private MyArrayList<T> stack;

    public MyStack() {
        stack = new MyArrayList<>();
    }

    public MyStack(int size) {
        stack = new MyArrayList<>(size);
    }

    public T peek() {
        if (IsEmpty()) {
            return null;
        }
        return stack.get(stack.getSize() - 1);
    }

    public T pop() {
        if (IsEmpty()) {
            return null;
        }
        return stack.remove(stack.getSize() - 1);
    }

    public void push(T obj) {
        stack.add(obj);
    }


    public boolean IsEmpty() {
        if (stack.getSize() == 0) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
