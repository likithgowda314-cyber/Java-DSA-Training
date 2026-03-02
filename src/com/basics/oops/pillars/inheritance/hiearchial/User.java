package com.basics.oops.pillars.inheritance.hiearchial;

import com.basics.oops.pillars.inheritance.multiple.A;

public class User {
    void role(){
        System.out.println("Generic user");
    }
}
class Admin extends User{
    @Override
    void role(){
        System.out.println("Admin user");
    }

}
class Guest extends User {
    @Override
    void role() {
        System.out.println("Guest user");
    }
}
class Demo {
    public static void main(String[] args) {
        User user= new User();
        user.role();
        //Upcasting
        Admin admin = new Admin();
        admin.role();
        Guest guest = new Guest();
        guest.role();
    }
}
// ✅ The reference does't matter - the object matters