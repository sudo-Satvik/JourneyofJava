package com.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = 0, secondNum = 1;
        int num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("1 position: "+firstNum);
            case 2 -> System.out.println("2 position: "+secondNum);
            default -> {
                int i = 2;
                while (i < num) {
                    int auxMem = secondNum;
                    secondNum = secondNum + firstNum;
                    firstNum = auxMem;
                    i++;
                }
                System.out.println(num+" position: "+secondNum);
            }
        }

    }
}
