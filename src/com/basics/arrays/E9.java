package com.basics.arrays;
class Equipment {
    String name;
    int  equipmentId;
    String lab;
    double voltage;
    boolean isWorking;

    public Equipment(String name, int equipmentId, String lab, double voltage, boolean isWorking) {
        this.name = name;
        this.equipmentId = equipmentId;
        this.lab = lab;
        this.voltage = voltage;
        this.isWorking = isWorking;
    }
}
public class E9 {
    public static void main(String[] args) {
        Equipment[] equipments = new Equipment[]{
                new Equipment("oscilloscpe", 100, "analog lab", 220, true),
                new Equipment("vlsi",100,"circuits",200,false),
                new Equipment("Signal analyser",500,"digital",107,true)
        };
        for (Equipment equipment:equipments){
            System.out.println(equipment.name+ " "+equipment.equipmentId+" "+equipment.lab+" "+equipment.voltage+" "+equipment.isWorking+" ");
        }

    }

}
