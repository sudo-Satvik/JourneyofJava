package com.practice.d_conditionals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a>b){
            System.out.println("a is greater");
        }else if(a==b){
            System.out.println("both are equals");
        }else{
            System.out.println("b is greater");     // This is the true statement so it will printed!
        }
    }
}
