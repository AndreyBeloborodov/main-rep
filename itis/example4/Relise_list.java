package itis.example4;

import itis.example4.Base.List;

public class Relise_list {
    public static void main(String[] args) {
        List Mylist = new List(1);
        for(int i = 0; i < Mylist.size; i++) {
            Mylist.list[i] = ("a");
        }

        for(String s : Mylist.list) System.out.print(s + " ");
        System.out.println();

        Mylist.add(0, "b");

        for(String s : Mylist.list) System.out.print(s + " ");
        System.out.println();

        Mylist.add(2, "c");

        for(String s : Mylist.list) System.out.print(s + " ");
        System.out.println();

        Mylist.remove(1);

        for(String s : Mylist.list) System.out.print(s + " ");
    }

}
