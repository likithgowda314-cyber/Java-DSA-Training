package com.basics.oops.pillars.polymorphism.overriding;

public class RBI {

    double rateOfIntrest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfIntrest(){
        return 7.2;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfIntrest(){
        return 7.5;
    }
}
class CANARA extends RBI{
    @Override
    double rateOfIntrest() {
        return 7.8;
    }

    public static void main(String[] args) {
        // Upcasting ->> Parent obj = new child();
        RBI rbi = new RBI();
        HDFC hdfc = new HDFC();
        ICICI icici =new ICICI();
        CANARA canara = new CANARA();
        System.out.println("THE ROI of RBI is :" + rbi.rateOfIntrest()+"%");
        System.out.println("THE ROI of HDFC is :" + hdfc.rateOfIntrest()+"%");
        System.out.println("THE ROI of ICICI is:" + icici.rateOfIntrest()+"%");
        System.out.println("THE ROI of CANARA is:" + canara.rateOfIntrest()+"%");
    }
}
