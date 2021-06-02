package week6.day3;

public class Node<T> {
    T value;
    Node<T> next;
    Node<T> previous;
    public Node(T value) {
        this.value = value;
    }
}
