package com.practice.j_array;

import java.util.Scanner;

public class Array5 {
//    Array of objects(non-primitive datatype)
//    I'm using forEach loop

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (String num: arr)   // For every element "num" in array "arr", print the element
        {
            System.out.println(num);
        }
    }
}
