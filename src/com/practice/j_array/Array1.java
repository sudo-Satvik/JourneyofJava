package com.practice.j_array;

public class Array1 {
    public static void main(String[] args) {
        // For storing a roll number, we can do is:
        int rollNo = 12;
        // For storing a name, we can do is:
        String name = "Satvik";

        // For storing multiple values, we can do:
        // We use array

//        datatype[] varname = new datatype[size];

        // Store 5 roll numbers
//        int[] roll = new int[5];    // where LHS is reference variable and RHS is object declaration

//        or we can directly write this
//        int[] rns = {23, 15, 12, 43};

        /*
        All the type of the data should be same
        which means this is illegal in Java:
        {12, "Satvik", 12.4323}
         */

        // Actual working of the Array:
//        int[] arr;  // declaration of array; arr variable is getting defined in the stack memory.
//        arr = new int[5]; // initialisation of array; here object is been created in the heap memory
    }
}
