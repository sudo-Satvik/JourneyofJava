package com.practice.j_array;

import java.util.Arrays;
import java.util.Scanner;

//How to input the values of array with the help of toString method
public class Array4 {
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
        System.out.println(Arrays.toString(arr)); // THAT'S IT!
    }
}
