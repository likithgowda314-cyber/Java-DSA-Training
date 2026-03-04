package com.basics.threads;

public class ResultDeclaration {
    synchronized void declaration() throws Exception{
        System.out.println("Admin waiting for approval...");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args) throws Exception{
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(() -> {
            try {
                rd.declaration();
            }catch (Exception e){}
        }).start();
        Thread.sleep(100);
        new Thread(() -> rd.approve()).start();

    }
}
