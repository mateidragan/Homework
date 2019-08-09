package com.siit.homework.week3.Exercise2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The prime numbers lower than " + number + " are :");
        System.out.println(primeLower(number));
    }

    public static String primeLower(int number){
        String  primeNumbers = "";
        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        return primeNumbers;
    }
}
