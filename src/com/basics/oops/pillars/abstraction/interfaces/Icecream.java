package com.basics.oops.pillars.abstraction.interfaces;

public interface Icecream {
    String icecream1();
    String icecream2();
    String icecream3();
}
class Icecreams implements Icecream{


    public static void main(String[] args) {
        Icecreams icecreams = new Icecreams();
        System.out.println(icecreams.icecream1());
        System.out.println(icecreams.icecream2());
        System.out.println(icecreams.icecream3());
    }

    @Override
    public String icecream1() {
        return " Butterscotch";
    }

    @Override
    public String icecream2() {
        return "Vanilla";
    }

    @Override
    public String icecream3() {
        return "blackberry";
    }
}

