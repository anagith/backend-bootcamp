package week6.day3;

public class MyDoubleLinkedList<T> implements MyList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    @Override
    public T get(int index) {
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
        tail.next = node;
        node.previous = tail;
        tail = node;
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<T> temp = head;
        if (index == 0) {
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
        if (head.value.equals(obj)) {
            head = head.next;
            head.previous = null;
            size--;
            return true;
        }
        Node<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            if (temp.next.value.equals(obj)) {
                temp.next.previous = temp.previous;
                temp.previous.next = temp.next;
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
        for (int i = 0; i < size - 1; i++) {
            if (temp.value.equals(obj)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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
}
