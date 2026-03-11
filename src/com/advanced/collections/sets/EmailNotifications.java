package com.advanced.collections.sets;

import java.util.Collections;
import java.util.HashSet;

public class EmailNotifications {
    public static void main(String[] args) {
        HashSet<String> emailqueue = new HashSet<>();
        emailqueue.add("a@email.com");
        emailqueue.add("b@email.com");
        emailqueue.add("a@email.com");
        emailqueue.add("a@email.com");
        emailqueue.add("c@email.com");
        emailqueue.add("d@email.com");
        emailqueue.add("c@email.com");
        System.out.println("Emails to send;"+ emailqueue);
        System.out.println("Unique Emails:"+emailqueue.size());
    }
}
