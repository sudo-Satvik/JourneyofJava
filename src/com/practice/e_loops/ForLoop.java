package com.practice.e_loops;

public class ForLoop {
    public static void main(String[] args) {
        /*
        Syntax:
        for(initialization;condition;increment){}
         */
        for (int i = 1;i<=5;i++){
            System.out.println(i);
        }

//        Nested for loop

        for(int j=0; j<2;j++){
           for (int k=0;k<3;k++){
               System.out.println(j+" "+k);
           }
        }
    }
}
