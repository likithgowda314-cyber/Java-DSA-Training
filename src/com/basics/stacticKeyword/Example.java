package com.basics.stacticKeyword;

public class Example {
    // Static belongs to the Stack Memory.
    // No object are needed for it.
    //The static block executes with the class before main()
    static  int x=2;
    static {
        System.out.println("Open the system");
    }
    public static void main(String[] args) {
        System.out.println("SNPSU-ECE-2027");
        System.out.println(x);
    }
    static {
        System.out.println("start the app");
        System.out.println("DB.start()");
        System.out.println("Internet.start()");
    }

}
