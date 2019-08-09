package com.siit.homework.week3.Exercise2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The sum is: " + sumOfNumbers(number));
    }

    public static int sumOfNumbers(int number){
        int sum=0;
        int x = 0;

        while (x <= number){
            sum += x;
            x++;
        }

        return sum;
    }
}

