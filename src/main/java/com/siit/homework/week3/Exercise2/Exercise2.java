package com.siit.homework.week3.Exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=input.nextInt();
        int[] numbers = new int[n];
        System.out.println("enter elements");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();

        }

        System.out.println("The minimum element with for is: " + minimumElement(numbers));
        System.out.println("The minimum element with foreach is: " + minimumForeach(numbers));
    }

    public static int minimumElement(int[] numbers){
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int minimumForeach(int[] numbers){
        int min = numbers[0];

        for (int j : numbers) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }
}
