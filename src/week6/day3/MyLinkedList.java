package week6.day3;

public class MyLinkedList<T> implements MyList<T> {
    Node<T> first;
    Node<T> last;
    int size;
    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    @Override
    public void add(T obj) {
        Node<T> node = new Node<>(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }
    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            first = first.next;
            size--;
            return;
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (index == size - 1) {
            last = current;
            last.next = null;
        }
        current.next = current.next.next;
        size--;
    }
    @Override
    public boolean remove(T obj) {
        if (first.value.equals(obj)) {
            first = first.next;
            size--;
            return true;
        }
        Node<T> current = first;
        for (int i = 0; i < size - 1; i++) {
            if (current.next.value.equals(obj)) {
                if (i == size - 2) {
                    current.next = null;
                    last = current;
                } else {
                    current.next = current.next.next;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(T obj) {
        Node<T> current = first;
        for(int i = 0; i < size; i++){
            if(current.value.equals(obj)){
                return true;
            }
            current = current.next;
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
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = first;
        for(int i = 0; i < size; i++){
            result.append(current.value);
            if(i < size - 1){
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}