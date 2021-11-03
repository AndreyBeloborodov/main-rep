package itis.example4.Base;

public class List {
    public int size;
    public String[] list;

    public List (int size) {
        this.size = size;
        list = new String[size];
    }
    public void add(int index, String value) {
        if(index < 0 || index > size) {
            System.out.println("Error");
            return;
        }
        size++;
        String[] buf = list;
        int ok = 0;
        list = new String[size];
        for(int i = 0; i < size; i++) {
            if(i == index) {
                list[i] = value;
                ok = 1;
                continue;
            }
            list[i] = buf[i - ok];
        }
    }

    public void remove(int index) {
        if(index < 0 || index >= size) {
            System.out.println("Error");
            return;
        }
        String[] buf = list;
        int ok = 0;
        list = new String[size - 1];
        for(int i = 0; i < size; i++) {
            if(i == index) {
                ok = 1;
                continue;
            }
            list[i - ok] = buf[i];
        }
        size--;
    }

}
