package com.problems;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        swapNum(a,b);
        swapNum1(a, b);
    }

    static void swapNum(int a, int b){
//        Swapping by taking an auxillary memory space
        int temp = a;
        a = b;
        b = temp;
        String s = a + " " + b;
        System.out.println("Swapped: "+s);
    }

    static void swapNum1(int c, int d){
//        Swapping the number without utilising an auxillary space
        c = c - d;
        d = d + c;
        c = d - c;
        String s = c + " " + d;
        System.out.println("Swapped: "+s);
    }
}
