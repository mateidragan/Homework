package com.siit.homework.week3.Exercise2;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        }else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0 )
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome  /= 10;
        }

        return number == reverse;
    }
}
