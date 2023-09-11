package com.practice.l_binary_search;

//For the descending order sorted array

public class BS2 {
    public static void main(String[] args) {
        int[] arr = {98, 85, 76, 50, 23, 12, 6, 4, 2, 0, -12, -32};
        int tar = 12;
        int ans = binarySearch(arr, tar);
        System.out.println(ans);
    }
    static int binarySearch(int[] array, int target){
        int startIndex = 0, endIndex = array.length, midIndex;
        midIndex = startIndex + (endIndex - startIndex) / 2;
        while(startIndex<=endIndex){
            if (target < array[midIndex]){
                startIndex = midIndex + 1;
            } else if (target > array[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}
