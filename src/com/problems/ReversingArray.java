package com.problems;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println("Unreversed: "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed: "+Arrays.toString(arr));
    }

    static void reverse(int[] array){
        int start = 0;  //First index
        int end = array.length-1;   //Last index

        while (start<end){
            swap(array, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int ind1, int ind2){
        arr[ind1] = arr[ind1] - arr[ind2];
        arr[ind2] = arr[ind1] + arr[ind2];
        arr[ind1] = arr[ind2] - arr[ind1];
    }

}
