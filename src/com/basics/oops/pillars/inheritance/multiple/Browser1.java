package com.basics.oops.pillars.inheritance.multiple;

public interface Browser1 {
    void browser1();
}
interface Browser2{
    void Browser2();
}
interface Browser3{
    void Browser3();
}
class Broswers implements Browser1,Browser2,Browser3 {
    @Override
    public void browser1() {
        System.out.println("Google Chrome");
    }

    @Override
    public void Browser2() {
        System.out.println("Mozilla");
    }

    @Override
    public void Browser3() {
        System.out.println("Safari");
    }

    public static void main(String[] args) {
        Broswers browser = new Broswers();
        browser.browser1();
        browser.Browser2();
        browser.Browser3();
    }

}
