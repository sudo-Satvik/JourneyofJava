package com.practice.j_array;

import java.util.Arrays;

public class Array6 {
    static void changeArray(int[] arr){
        arr[0] = 700;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        changeArray(array);
        System.out.print("Modified by Method: "+Arrays.toString(array));
    }
}
