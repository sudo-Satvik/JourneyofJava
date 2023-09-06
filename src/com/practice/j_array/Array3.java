package com.practice.j_array;

//How to input the values of array with the help of for loop

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of index: ");
        int index = sc.nextInt();
        int[] arr = new int[index];
        // Taking the input
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the element number "+i);
            arr[i] = sc.nextInt();
        }
        // Receiving the output
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
