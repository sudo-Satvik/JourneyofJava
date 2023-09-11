package com.practice.k_linear_search;

public class LS1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 45, 6, 34, 432, 324, 23,423 ,234,23423,423,432,4};
        System.out.println(linearSearch(array, 32234));
    }
//    Searching inside the array:
//    Return the index if element found
//    Return -1 if the element doesn't found

    static int linearSearch(int[] arr, int target){
        if(arr.length==0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) return i;
        }
        return Byte.MIN_VALUE;
    }
}
