package com.basics.oops.pillars.inheritance.single;

public class Library {
    String name;
    int id;
    Library(String name , int id){
        this.name=name;
        this.id=id;
    }
}
class Book extends Library{
    double price;
    Book(int id , String name, double price){
        super(name,id);
        this.price=price;
    }
    void details(){
        System.out.println(id +" "  +name+" "+price);
    }

    public static void main(String[] args) {
        Book book=new Book(101,"love",1000);
        book.details();
    }
}