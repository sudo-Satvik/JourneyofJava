package com.problems;

import java.util.Scanner;

public class Palindrome {
//    Program to check the palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number more than 100");
        int num = sc.nextInt();
        if (num>100){
            int lastDigit, finalValue=0, origValue;
            origValue = num;
            while(num>0){
                lastDigit = num%10;
                finalValue = finalValue*10 + lastDigit;
                num /= 10;
            }
            if (origValue == finalValue){
                System.out.println("Palindrome");
            }else {
                System.out.println("Not Palindrome");
            }
        }else {
            System.out.println("Error x404");
        }
    }

}
