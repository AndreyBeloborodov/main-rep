package itis.example4.Base;

public interface Mylist<T> extends Collection {
    void add(T value);
    void remove(Integer index);
    T get(Integer index);
}
