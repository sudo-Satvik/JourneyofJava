package com.practice.j_array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> sat = new ArrayList<>(2);
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
        sat.add("Satvik");
//        We can add so many times we want
        System.out.println(sat);
//      Since we wrote capacity is 2, then how can we write around many entries: do watch on my diary

//        Multidimensional Array List
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialising ~ if we don't do this then by default the index values will be null
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding the element
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the value in row no. "+i);
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }

        // Outputting the array
        System.out.println(list);
    }
}
