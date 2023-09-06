package com.problems;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5};
        swap2(arr, 1, 3);
    }

    // By using auxiliary memory space
    static void swap(int[] array, int ind1, int ind2){
        System.out.println("Non swapped array: "+Arrays.toString(array));
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
        System.out.println("Swapped array: "+ Arrays.toString(array));
    }

    // Without using auxiliary memory space
    static void swap2(int[] array, int ind1, int ind2){
        System.out.println("Non swapped array: "+Arrays.toString(array));
        array[ind1] = array[ind1] - array[ind2];
        array[ind2] = array[ind1] + array[ind2];
        array[ind1] = array[ind2] - array[ind1];
        System.out.println("Swapped array: "+ Arrays.toString(array));
    }
}
