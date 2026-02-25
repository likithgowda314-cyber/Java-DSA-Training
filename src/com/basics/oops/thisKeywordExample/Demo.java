package com.basics.oops.thisKeywordExample;

public class Demo {
    // instance variable
    String i;
    void change(String i){
        // to remove ambiguity ,we use the keyword
        this.i = i;     //ambiguity - confusion
    }
    void display(){
        System.out.println("the vaule of i is :"+i);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.change("Demo");
        obj.display();
    }
}
