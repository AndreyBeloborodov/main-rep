package itis.example5;

import java.util.Scanner;

public class Zadachka {

    public static int solve(int k, int[] v) {
        v = sort(v);
        return v[v.length - k];
    }

    public static int[] sort(int[] v) {

        int n = v.length;
        for (int i = 0; i < n; i++) {
            int imin = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[imin]) {
                    imin = j;
                }
            }
            int t = v[imin];
            v[imin] = v[i];
            v[i] = t;
        }
        return  v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int size = 0;
        int[] array = new int[size];
        while (true) {
            int numbre = scanner.nextInt();
            size++;
            if (numbre == -1) {
                size--;
                break;
            }
            int[] buf = array;
            array = new int[size];

            for (int i = 0; i < size - 1; i++) {
                array[i] = buf[i];
            }
            array[size - 1] = numbre;
        }

        System.out.println(solve(k, array));

    }
}
