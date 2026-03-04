package com.basics.exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j ,k=0;
        i=10;
        j=10;
        try {
            k = i / j;
            String name = "Java";
            System.out.println(name.charAt(6));
        }catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("the index of string is OOB ");
        }catch (Exception e){ // the Exception block should be at the last
            System.out.println("something unexpected happened.");
        }
        finally{
            System.out.println("this block will always execute");
            System.out.println("no matter what happens to the code ");
            System.out.println("we use the code for releasing resources");
            System.out.println("all intrest ,db,files,etc aren closed here");
        }
        System.out.println("the value of k is: "+k);
    }
}
