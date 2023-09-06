package com.practice.a_datatype;

public class Datatypes {
    public static void main(String[] args) {
        System.out.println("There are 2 types of Datatypes:");
        System.out.println("1. Primitive Datatype: Primitive Datatypes are intinsic datatypes which means it can't be further derived. There are 8 types: ");
        System.out.println("1.1. Boolean: 1 bit");
        boolean bool = true;
        System.out.println(bool);
        System.out.println("============================");
        System.out.println("1.2. Byte: 8 bits = 1 byte");
        byte by = 127;
        System.out.println(by);
        System.out.println("============================");
        System.out.println("1.3. Short: 16 bits = 2 bytes");
        short sh = 32767;
        System.out.println(sh);
        System.out.println("============================");
        System.out.println("1.4. Int: 32 bits = 4 bytes");
        int i = 2_147_483_647;
        System.out.println(i);
        System.out.println("============================");
        System.out.println("1.5. Long: 64 bits = 8 bytes");
        long l = 9_223_372_036_854_775_807L;
        System.out.println(l);
        System.out.println("============================");
        System.out.println("1.6. Float: 32 bits = 4 bytes");
        float f = 123.1234567f;
        System.out.println(f);
        System.out.println("============================");
        System.out.println("1.7. Double: 64 bits = 8 bytes");
        double d = 123.1234567891234567;
        System.out.println(d);
        System.out.println("============================");
        System.out.println("1.8. Character: 16 bits = 2 bytes");
        char ch = 'S';
        System.out.println(ch);
    }
}
