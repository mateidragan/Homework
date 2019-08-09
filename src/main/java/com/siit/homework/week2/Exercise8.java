package com.siit.homework.week2;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number;
        number = input.nextInt();
        long factorial = 1;

        for(int i = 1; i <= number; i++){
            factorial *= i;
        }

        System.out.printf("Factorial of %d = %d", number, factorial);
    }
}
