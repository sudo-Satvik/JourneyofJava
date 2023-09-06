package com.practice.f_input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        System.out.println("Your name is "+name+" and your age is "+a);
    }
}
