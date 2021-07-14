package week6.day3;

public interface MyList<T> {
    T get(int index);
    void add(T obj);
    void remove(int index);
    boolean remove(T obj);
    int size();
    boolean contains(T obj);
}
