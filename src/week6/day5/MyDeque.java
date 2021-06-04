package week6.day5;

public interface MyDeque<T> {
    public void addFirst(T obj);

    public void addLast(T obj);

    public T getFirst();

    public T getLast();

    public void removeFirst();

    public void removeLast();
}
