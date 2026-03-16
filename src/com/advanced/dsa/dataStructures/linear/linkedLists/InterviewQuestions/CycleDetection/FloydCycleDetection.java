package com.advanced.dsa.dataStructures.linear.linkedLists.InterviewQuestions.CycleDetection;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class FloydCycleDetection {
    static Node head;
    static void createlist(){
        head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=null;// head.next; // 4 --> 2
    }
    static boolean hasCycle(){
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next; // Move step 1
            fast=fast.next.next; // Move step 2
            if (slow==fast){ // If slow & fast meet -> cycle exists
                return true;
            }

        }
        return false; // if loop ends & they don't meet -> No cycle
    }

    public static void main(String[] args) {
        createlist();
        System.out.println(hasCycle() ? "Cycle detected": "No Cycle");

    }
}
