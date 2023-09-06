package com.practice.g_methods;

import java.util.Arrays;

// Whenever a method takes variable number of argument then it is known as Variable Arguments.
public class VarArgs {
    public static void main(String[] args) {
        fun(3, 4, 5, 6, 7, 10, 21, 42); //We can take any number of arguments

        multipleTypeParam(12, 13, "Satvik", "Mayank", "Satan");
    }
    static void fun(int ...s){
        System.out.println(Arrays.toString(s));
    }

    // What if mix of argument (mixed and keyword args)

    static void multipleTypeParam(int a, int b, String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
}

