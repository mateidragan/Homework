package com.siit.homework.week2;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int reverse = 0;
        int remainder;
        int initial;

        initial = number;

        while( number != 0 )
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number  /= 10;
        }

        if (initial == reverse) {
            System.out.println(initial + " is a palindrome.");
        }else {
            System.out.println(initial + " is not a palindrome.");
        }
    }

}
