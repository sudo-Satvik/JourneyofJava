package com.practice.k_linear_search;


//Linear Search in Strings
public class LS2 {
    public static void main(String[] args) {
        String name = "Satvik";
//        System.out.println(Arrays.toString(name.toCharArray()));
        char target = 'a';
        boolean bool = searchString(name, target);;
        boolean bool2 = searchString2(name, target, 2, 4);
        System.out.println(bool2);
    }
    static boolean searchString(String str, char target){
        if (str.isEmpty()) return false;
        for (int i = 0; i < str.length() ; i++) {
            if (target==str.charAt(i)) return true;
        }
        return false;
    }

//    Searching within the range
    static boolean searchString2(String str, char target, int start, int end){
        if (str.isEmpty()) return false;
        for (int i = start; i < end ; i++) {
            if (target==str.charAt(i)) return true;
        }
        return false;
    }
}
