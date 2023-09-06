package com.problems;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int in = input.nextInt();
        System.out.println(isPrime(in));
    }

    static boolean isPrime(int in) {
        if(in <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= in){
            if (in%c == 0) return false;
            c++;
        }
        return c*c>in;
    }
}
