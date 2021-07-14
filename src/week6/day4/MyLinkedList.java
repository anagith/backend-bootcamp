package week6.day4;

import week6.day3.MyList;
import week6.day3.Node;

public class MyLinkedList<T> implements MyList<T> {
    Node<T> head;
    Node<T> tail;
    int size;


    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> temp;
        if (index == 0) {
            return head.value;
        } else if (index == size - 1) {
            return tail.value;
        } else if (index <= size / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp.value;
    }

    @Override
    public void add(T obj) {
        Node<T> node = new Node<>(obj);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        if (size == 1) {
            tail = node;
            head.next = tail;
            head.previous = null;
            tail.next = null;
            tail.previous = head;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<T> temp = head;
        if (index == 0 && size == 1) {
            head = null;
            size--;
            return;
        } else if (index == 0) {
            head = head.next;
            head.previous = null;
            size--;
            return;
        } else if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
        } else if (index <= size / 2) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.next.previous = temp;
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
        size--;
    }

    @Override
    public boolean remove(T obj) {
        if (obj == null) {
            if (removeNull()) return true;
        } else {
            if (removeElement(obj)) return true;
        }
        return false;
    }

    private boolean removeElement(T obj) {
        if (head.value != null && head.value.equals(obj)) {
            head = head.next;
            head.previous = null;
            size--;
            return true;
        }
        Node<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            if (temp.next.value != null && temp.next.value.equals(obj)) {
                temp.next.next.previous = temp;
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private boolean removeNull() {
        if (size == 1 && head.value == null) {
            head = null;
            size--;
            return true;
        }
        if (head.value == null) {
            head = head.next;
            head.previous = null;
            size--;
            return true;
        }
        Node<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            if (temp.next.value == null) {
                temp.next.next.previous = temp;
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value != null && temp.value.equals(obj)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void removeFirstAndLast() {
        this.remove(0);
        this.remove(size - 1);
    }

    public void clear() {
        int count = size;
        for (int i = 0; i < count; i++) {
            remove(0);
        }
    }

    public boolean swap(T first, T second) {
        if (contains(first) && contains(second)) {
            Node<T> temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.value != null && temp.value.equals(first)) {
                    temp.value = second;
                } else if (temp.value != null && temp.value.equals(second)) {
                    temp.value = first;
                }
                temp = temp.next;
            }
            return true;
        }
        return false;
    }

    public void join(MyLinkedList<T> other) {
        tail.next = other.head;
        other.head.previous = tail;
        tail = other.tail;
    }

    public MyLinkedList<T> clone() {
        MyLinkedList<T> clone = new MyLinkedList<>();
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            clone.add(temp.value);
            temp = temp.next;
        }

        return clone;
    }

    public T[] toArray() {
        T[] arr = (T[]) new Object[size];
        Node<T> temp = head;
        if (size == 1 && head.value == null) {
            arr[0] = null;
        } else {
            for (int i = 0; i < size; i++) {
                arr[i] = temp.value;
                temp = temp.next;
            }
        }
        return arr;
    }

    public boolean compare(MyLinkedList<T> other) {
        if (this.size() != other.size()) {
            return false;
        } else {
            Node<T> firstTemp = head;
            Node<T> secondTemp = other.head;
            for (int i = 0; i < size; i++) {
                if (firstTemp.value == null) {
                    if (secondTemp.value == null) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (secondTemp.value == null) {
                    return false;
                }
                if (!firstTemp.value.equals(secondTemp.value)) {
                    return false;
                }
                firstTemp = firstTemp.next;
                secondTemp = secondTemp.next;
            }
        }
        return false;
    }

    public T set(int index, T element) {
        checkIndex(index);
        Node<T> temp = head;
        T old = get(index);
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = element;
        return old;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            result.append(temp.value);
            if (i < size - 1) {
                result.append(", ");
            }
            temp = temp.next;
        }
        result.append("]");
        return result.toString();
    }

    public T findMiddleElement() {
        Node first = head;
        Node second = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
        }
        return (T) second.value;
    }

    public boolean containsCycle() {
        Node first = head;
        Node second = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
            if (first == second) {
                return true;
            }
        }
        return false;
    }
}
