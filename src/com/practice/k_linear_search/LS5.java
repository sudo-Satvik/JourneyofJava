package com.practice.k_linear_search;

import java.util.Arrays;

//Search in 2D array
public class LS5 {
    public static void main(String[] args) {
        int[][] array = {
            {18, 2, 4, 9},
            {12, 32, 53, 19, 5},
            {123, 4, 53, 21},
            {23, 4, -10, 2}
        };
        int target = 123;
        System.out.println(search(array, target));  //Returns true/false
        System.out.println(Arrays.toString(search2(array, target)));    //Return indices
    }
//    In terms of true and false return type
    static boolean search(int[][] arr, int tgt){
        int i;
        if (arr.length==0) return false;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j<arr[i].length;j++){
                if (tgt == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

//    In terms of indices return
    static int[] search2(int[][]arr, int tgt){
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==tgt) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
