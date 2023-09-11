package com.problems;
/*
    This question is from LeetCode #1295

    Find numbers with even number of digits
 */
public class LC1295 {
    public static void main(String[] args) {
        int[] arr = {12, 321, 11, 413, -23313, 1223, 432, 12};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] array){
        int count = 0;
        for (int element : array){
            if (even(element)){
                count++;
            }
        }
        return count;
    }

    // My own way
    static boolean even(int data) {
        if (data<0){
            data *= -1;
        }
        int iter = 0;
        while(data>0){
            data /= 10;
            iter++;
        }
        return iter%2==0;
    }

    //Kunal's Way
    static boolean even2(int data){
        String s = String.valueOf(data);
        return s.length()%2==0;
    }
}
