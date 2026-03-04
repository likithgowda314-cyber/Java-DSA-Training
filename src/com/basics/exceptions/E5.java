package com.basics.exceptions;

import java.io.IOException;

public class E5 {
    static void readfile() throws IOException{  // Ducking
        // throws is used to pass information
        throw new IOException("Trying to read the file.");
    }
    public static void main(String[] args) {
        try {
            function_a();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void function_a()throws  IOException{
        function_b();
    }
    static void function_b()throws IOException{
        readfile();

    }
}
/*
⭐For checked excepriond we always use a try-catch block or throws
⭐The throws keyword doesnot handel the exception
⭐It only passes on the info to the calling method
⭐The caaling method has to handel the excption
⭐The throws keyword is used in the "method signature"
⭐The 'proces'of passing on the info is called "DUCKING"
 */
