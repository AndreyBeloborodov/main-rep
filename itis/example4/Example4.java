package itis.example4;

import itis.example4.Base.Mylist;
import itis.example4.relize.List_optimize;

public class Example4 {
    public static void main(String[] args) {
        Mylist<Integer> list = new List_optimize<>();
        list.add(45);
        list.add(156);
        list.remove(1);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
