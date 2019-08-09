package com.siit.homework.week2;

public class Exercise2 {

    public static void main(String[] args) {
        int[] numbers = {12, 35, 9, 20, 45};
        int n = numbers[0];

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < n) {
                n=numbers[i];
            }
        }

        System.out.println(n);

        for (int j : numbers) {
            if (j < n) {
                n = j;
            }
        }

        System.out.println(n);
    }
}
