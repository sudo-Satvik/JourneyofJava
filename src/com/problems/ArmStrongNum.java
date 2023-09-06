package com.problems;

import java.util.Scanner;

//We have to check armstrong number
public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong(int num){
        int origNum = num;
        int rem, cube, sum=0;
        while (num>0){
            rem = num % 10;
            cube = (int) Math.pow(rem, 3);
            sum = sum + cube;
            num = num / 10;
        }
        return origNum == sum;
    }
}
