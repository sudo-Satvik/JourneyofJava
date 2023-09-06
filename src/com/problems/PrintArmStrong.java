package com.problems;

//We have to print all armstrong numbers
public class PrintArmStrong {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
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
