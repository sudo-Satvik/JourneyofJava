package com.practice.j_array;
//In this, the columns are not fixed
// let i = row and j=column for better practices

public class DynamicArray {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
