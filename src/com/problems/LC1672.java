package com.problems;
//https://leetcode.com/problems/richest-customer-wealth/
public class LC1672 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int maxSum = 0, sum = 0;
        for(int i = 0; i < accounts.length; i++){

            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
            sum=0;
        }
        return maxSum;
    }
}
