package com.basics.oops.pillars.inheritance.multi;

public class SimpleCalculator{
    void add(int a , int b ){
        System.out.println(a+b);
    }
    void sub(int a , int b ){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void divide(int a , int b ){
        System.out.println(a/b);
    }
    void multiply(int a , int b ) {
        System.out.println(a * b);
    }
}
class SuperADvancedcalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(Math.pow(x,2));
    }
    void cube(int x){
        System.out.println(Math.pow(x,3));
    }

    public static void main(String[] args) {
        System.out.println("==================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(100,200);
        c1.sub(100000,9999);
        System.out.println("==================================");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.divide(16,4);
        c2.multiply(4,4);
        System.out.println("==================================");
        SuperADvancedcalculator c3= new SuperADvancedcalculator();
        c3.square(16);
        c3.cube(2);
    }
}