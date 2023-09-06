package com.practice.g_methods;

public class MethodOverloading {
//    In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

    public static void main(String[] args) {
        sameName("Satvik");
        sameName(12);
        sameName("BCA", 95.8f);
//        sameName();   //Ambiguity
    }

    static void sameName(int x){
        System.out.println(x);
    }
    static void sameName(String name){
        System.out.println(name);
    }

    static void sameName(String course, float marks){
        System.out.println("Course name is: "+course+" and marks are: "+marks);
    }
}

/* Ambiguity: when there will be now arguments while calling the function. Then that case is said to be ambiguity. */
