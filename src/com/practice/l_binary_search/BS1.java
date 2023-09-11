package com.practice.l_binary_search;

// For the ascending order sorted array
public class BS1 {
    public static void main(String[] args) {
//                    0     1   2  3  4  5  6  7   8  9   10  11  12
        int[] arr = {-12, -10, -5, 0, 1, 4, 5, 7, 12, 23, 43, 65, 87};
        int ans = binarySearch(arr, 23);    // 9th index
        System.out.println(ans);
    }

//    return the index of target element
//    return -1 if not found target element
    static int binarySearch(int[] array, int target){
        int startIndex = 0, endIndex = array.length-1;
        while(startIndex<=endIndex){
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target>array[midIndex])
                startIndex = midIndex + 1;
            else if(target<array[midIndex])
                endIndex = midIndex - 1;
            else
                return midIndex;    // answer
        }
        return -1;
    }
}
