package com.practice.j_array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArr {
//    2D array = Matrix kinda stuff
    /*
        1   2   3
        4   5   6
        7   8   9
     */

//    Syntax:
//    int[][] arr = new int[rows][columns];
//                  or
    /*
        int[][] arr = {
            {1, 2, 3},  //0th index
            {4, 5, 6},  //1st index
            {7, 8, 9}   //2nd index
        };
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
/*
        Column index initialisation may not be necessary!
        int[][] arr2 = new arr[4][];
        or
        int[][] arr2 = {
        {1, 2, 3},
        {4, 5},
        {12, 43, 1, 4, 4s}
        };
*/

//        Inputting the Array
            int[][] arr = new int[3][3];
//            arr.length => here this tells us about size of rows
            for (int row=0; row< arr.length;row++){
                System.out.println("Enter within "+row+" row");
                for (int column = 0;column<arr[row].length;column++){
                    System.out.print("Enter column element: ");
                    arr[row][column] = sc.nextInt();
                }
            }
//            Output the array
        for (int row=0; row< arr.length;row++){
            for (int column = 0;column<arr[row].length;column++){

//                System.out.print(arr[row][column]+" ");
            }
//            System.out.println();   //For matrix representation
        }
//            or we can do this

//        Outputting the array with the help of Enhanced for loop
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
