package com.problems;
//Maximum value inside the array
public class MaxArr {
    public static void main(String[] args) {
        float[] arr = {123.23f, 123.01f, 123.3f, 15.6f};
        System.out.println("Max value in the array: "+max(arr));
        System.out.println("Maximum value within the range of given indices: "+maxRange(arr, 0, 2));
    }

    static float max(float[] arr){
        if (arr.length==0)  return -1;
        float maxValue = arr[0];
        for (int i= 0; i<arr.length;i++){
            if(maxValue < arr[i]) maxValue = arr[i];
        }
        return maxValue;
    }

    // Maximum element within the range
    static float maxRange(float[] arr, int start, int end){

        // Work on edge cases lyk array being null or whatever!
        if(end>start)   return -1;
        if (arr==null)  return -1;

        float maxValue = arr[start];
        for (int i= 0; i<end;i++){
            if(maxValue < arr[i]) maxValue = arr[i];
        }
        return maxValue;
    }
}
