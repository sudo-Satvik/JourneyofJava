package com.practice.d_conditionals;

public class SwitchCase {
    public static void main(String[] args) {
//        Normal Switch Case
        int a = 3;
        switch (a){
            case 1:
                System.out.println("abc");
                break;
            case 2:
                System.out.println("def");
                break;
            case 3:
                System.out.println("ghi");  //This case will run because the given case is true as a = 3
                break;
            default:
                System.out.println("Default");
        }

//        Enhanced switch case
        int b = 2;
        switch (b) {
            case 1 -> System.out.println("abc");
            case 2 -> System.out.println("def");    //This case will run because the given case is true as b = 2
            case 3 -> System.out.println("ghi");
            default -> System.out.println("Default");
        }

    }
}
