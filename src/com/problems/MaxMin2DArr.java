package com.problems;
/*
In this program I used to solve that how can we find the maximum or minimum element in an 2D Array
using the LINEAR SEARCH ALGORITHM
 */
public class MaxMin2DArr {
    public static void main(String[] args) {
        int[][] array = {
                {12, 32, 34, 54, 23},
                {123, 34, 567, 75},
                {12, 1, 5, 6, 74, -1},
                {-13, 542, 123, 534}
        };
        int maxxie = max(array);
        int minnie = min(array);
        System.out.println("Maximum value is: "+maxxie+" and Minimum value is: "+minnie);
    }
    
//    Finding the max element
    static int max(int[][] arr){
        int maxValue = Integer.MIN_VALUE;
        for (int[] rowArea: arr) {
            for (int columnArea: rowArea){
                if (columnArea > maxValue)
                    maxValue = columnArea;
            }
        }
        return maxValue;
    }
    
//    Finding the min element
    static int min(int[][] arr){
        int maxValue = Integer.MAX_VALUE;
        for (int[] rowArea: arr) {
            for (int columnArea: rowArea){
                if (columnArea < maxValue)
                    maxValue = columnArea;
            }
        }
        return maxValue;
    }
}
