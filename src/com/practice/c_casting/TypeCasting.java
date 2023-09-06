package com.practice.c_casting;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Unlike Type Conversion, Type Casting occur only when the existing datatype is larger than desired datatype.
        We need to do some operations in order to attain the casting.

        It can occur as:

        double -> float -> long -> int -> short -> byte

         */

        float a = 10.9043f;

        int b = (int)a;

        System.out.println(b);
    }
}
