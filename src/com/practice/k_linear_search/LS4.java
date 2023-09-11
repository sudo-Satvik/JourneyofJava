package com.practice.k_linear_search;
//Find the minimum number and maximum number
public class LS4 {
    public static void main(String[] args) {
        int[] arr = {12, 15, 1, -7, -23, 213, 23};
        int minimumElement = min(arr);
        int maximumElement = max(arr);
        System.out.println("Minimum element is: "+minimumElement+" and "+"Maximum element is: "+maximumElement);
    }
    static int max(int[] array){
        int maxVal = array[0];
        for (int i = 0; i < array.length; i++){
            if (maxVal<array[i]) maxVal = array[i];
        }
        return maxVal;
    }
    static int min(int[] array){
        int minVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minVal>array[i]) {
                minVal = array[i];
            }
        }
        return minVal;
    }
}
