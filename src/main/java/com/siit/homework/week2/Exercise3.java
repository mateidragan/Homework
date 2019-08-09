package com.siit.homework.week2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int max=0;

        if (number != 0) {
            max = Integer.MIN_VALUE;

            while (number != 0) {
                int digit = number % 10;

                max = Math.max(max, digit);

                number /= 10;
            }
        }

        System.out.println("The max digit from the number is: " + max);
    }
}
