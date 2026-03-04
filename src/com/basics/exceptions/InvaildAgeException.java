package com.basics.exceptions;

import org.w3c.dom.ls.LSOutput;

public class InvaildAgeException extends Exception{
    InvaildAgeException(String msg){
        super(msg);
    }
}
class Main{
    static void vote(int age) throws InvaildAgeException{
        if(age<18){
            throw new InvaildAgeException(("age must be atleast 18."));
        }
        System.out.println("you can vote!");
    }

    public static void main(String[] args) {
        try {
            vote(16);
        }catch (InvaildAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
//com.basics.exceptions.InvaildAgeException
// ✅fully qualified class name - name of the class along with the folders
