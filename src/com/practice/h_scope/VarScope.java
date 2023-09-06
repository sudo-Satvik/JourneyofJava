package com.practice.h_scope;
/*
            There are three types of scope in Java:
            1. Class Level Scoping: These variables must be declared inside class (must outside any function). They can be directly accessed anywhere in class.
            2. Method Level Scoping: Variables declared inside a method have method level scope and can’t be accessed outside the method.
            3. Block Level Scoping: A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only. Values initialised in the block will remain in the block.
*/
public class VarScope {

    String name = "Satvik"; // Class Level Scoping
    public static void main(String[] args) {
//        System.out.println(num);    // The variable num is unknown here because variable num is bounded within Method Level Scoping

//        {
//            // The variable x has scope within
//            // brackets
//            int x = 10;
//            System.out.println(x);
//        }
        int a = 10;
        {
            a = 20; // Variable a can't initialize here but modified here
            System.out.println(a);
            int b = 30;
        }
//        System.out.println(b);    // Variable b can't be print here cuzz of block scope
    }

    static void randomMethod(){
        int num = 67;   //Local Variable
    }
}
