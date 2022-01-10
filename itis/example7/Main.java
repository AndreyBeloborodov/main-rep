package itis.example7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lin_numbers;
        lin_numbers = sc.nextInt();
        int[] numbers = new int[lin_numbers];
        for (int i = 0; i < lin_numbers; i++) {
            int number;
            number = sc.nextInt();
            numbers[i] = number;
        }
        int lin_digits = sc.nextInt();
        int[][] digits = new int[lin_digits][];
        for (int i = 0; i < lin_digits; i++) {
            int lin_digits_string;
            lin_digits_string = sc.nextInt();
            digits[i] = new int[lin_digits_string];
            for (int j = 0; j < lin_digits_string; j++) {
                int digit;
                digit = sc.nextInt();
                digits[i][j] = digit;
            }
        }
        for (int i = 0; i < lin_digits; i++) {
            for (int j = 0; j < digits[i].length; j++) {
                System.out.print(digits[i][j] + " ");
            }
            System.out.println();
        }
    }
}
