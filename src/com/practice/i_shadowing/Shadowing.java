package com.practice.i_shadowing;

public class Shadowing{
    /*
    Shadowing in java is a practice of using two variables with the same name within the scope that overlaps, then the variable with the higher level of scope viz. Class Level of Scope will get ignored
     */

    static int x = 12;  // in order to access static method we need to declare the static   //This will be shadowed at line 12

    public static void main(String[] args) {
        System.out.println(x);  // x = 12
        int x = 13; // This will shadow the static int x = 12
        System.out.println(x);  // x = 13   as the block overlapped so the higher level of scope get ignored
        rems();
    }

    static void rems(){
        System.out.println(x);      // can be accessed from here
    }
}
