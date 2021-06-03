package week6.day3;


public class MyCircularDoubleLinkedList<T> implements MyList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
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
            head.previous = tail;
            tail.next = head;
            tail.previous = head;
        } else {
            tail.next = node;
            node.previous = tail;
            node.next = head;
            head.previous = node;
            tail = node;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.previous = temp;
        size--;
    }


    @Override
    public boolean remove(T obj) {
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

    public String toString(int index) {
        checkIndex(index);
        String result = "Circular linked list from index ";
        for (int i = index; i < index + size; i++) {
            if (i < size) {
                result = result + get(i) + " ";
            } else {
                result = result + get(i % size) + " ";
            }
        }
        return result;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
