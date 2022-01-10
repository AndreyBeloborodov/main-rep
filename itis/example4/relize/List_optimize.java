package itis.example4.relize;

import itis.example4.Base.Mylist;

public class List_optimize<T> implements Mylist<T> {
    private final int INCREMENTS_VALUE = 5;
    private int arraySize = 5;
    private Object[] elements = new Object[arraySize];
    private int size = 0;

    @Override
    public void add(T element) {
        if (size >= arraySize) {
            int bufSize = arraySize;
            arraySize = bufSize + INCREMENTS_VALUE;
            Object[] buf_elements = elements;
            elements = new Object[arraySize];
            for (int i = 0; i < size; i++) {
                elements[i] = buf_elements[i];
            }
        }
        elements[size] = element;
        size++;
    }

    @Override
    public void remove(Integer index) {
        Object[] new_elements = new Object[arraySize];
        int ok = 0;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                ok = 1;
                continue;
            }
            new_elements[i - ok] = elements[i];
        }
        elements = new_elements;
        size--;
    }

    @Override
    public T get(Integer index) {
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
