package com.siit.homework.week3.Exercise2;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.printf("Factorial of %d is: ", number);
        System.out.println(factorialResult(number));
    }

    public static long factorialResult(int number) {
        long factorial = 1;

        for(int i = 1; i <= number; i++){
            factorial *= i;
        }

        return factorial;
    }
}
