package com.basics.threads;

public class FestRegistration {
    // From fill up
    static  class FromFilling extends Thread{
        public void run(){
            System.out.println("Form filling Started");
        }

    }
    // upload Documents
    static class DocumentsUploadn extends  Thread{
        public void run(){
            System.out.println("Document Upload Started");
        }

    }
    // Email Notifications
    static  class EmailNOtification extends Thread{
        public void run(){
            System.out.println("Email Notification Sent");
        }
    }
    public static void main(String[] args) {
        FromFilling t1 = new FromFilling();
        DocumentsUploadn t2 = new DocumentsUploadn();
        EmailNOtification t3 = new EmailNOtification();
        t1.start();
        t2.start();
        t3.start();
        // run() is used to get the output in order
        // start() is used to do multi threading

    }
}
/*
Points to remeber :
⭐Java Program starts with one main thread
⭐ THreads allow "paraller execution " -> concurrency
⭐output order ins never guaranteed
⭐Threads share the same memory
⭐Improves the performance & responsivness
⭐when start() is called directly , there no concurreny
⭐process is a running program
⭐thread is a path of excution inside the program
⭐a process has its own memory
⭐threads share the same memory
⭐creating a thread is cheaper than creativity a process
ℹ️Examples
⭐Process -> google chrome Browser ; thread -> new tab of chrome
⭐closing a tab will not close chrome or will kill chrome
 */
