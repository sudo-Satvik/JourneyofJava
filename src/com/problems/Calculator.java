package com.problems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean apt = true;
        while (apt == true){
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Operation you wanna perform:\n1. Addition \n2. Subtraction\n3. Multiply\n4. Divide");
            int opr = sc.nextInt();
            System.out.println("=========Result===========");
            switch (opr){
                case 1 -> System.out.println(a+b);
                case 2 -> System.out.println(a-b);
                case 3 -> System.out.println(a*b);
                case 4 -> System.out.println(a/b);
                default -> System.out.println("Enter a valid number [1 to 4]");
            }
            System.out.println("=========End===========");
            System.out.println("More?\nY/N");
            char ch = sc.next().charAt(0);
            if (ch=='Y'){
                apt = true;
            }
            if(ch == 'N'){
                apt = false;
            }else {
                System.out.println("Invalid");
                apt = false;
            }
        }

}
}
