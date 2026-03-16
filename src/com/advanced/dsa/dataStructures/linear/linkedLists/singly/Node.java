package com.advanced.dsa.dataStructures.linear.linkedLists.singly;
class LL  {
    Node head; // Starting node of the list only access point
    private int size;
    LL(){
        size=0; // Initially list is empty ,so the size is zero.
    }
    public class Node {
        String data; // The data of the nodes -> String type
        Node next; // The address of the next node -> node Type
        Node(String data) {
            this.data = data;
            this.next = null;// Initially node is connected to null
            size++; // Increment the size as a node is created
        }
    }
    public void printlist(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void addFirst(String data){
        //Create a new node
        Node newNode = new Node(data);
        //Point the next node of new node to the head
        newNode.next=head;
        // this newnode is the new head of the list
        // point the head to this new node
        head=newNode;
    }
    public void addlast(String data){
        //Create a new node
        Node newNode = new Node(data);
        // If the lis is empty  - head will point to null
        if (head==null){
            head=newNode; // the newNode becomes the haed of the list
            return;
        }
        // for multiple elements -we need to find the last(tail) node
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        // after the loop is over we will be standing @last node
        // point the last node next to newnode
        last.next=newNode;
    }
    public void removeFirst(){
        // Empty list -> give a message to user & retuen to main
        if (head==null){
            System.out.println("Empty list . Can't remove head");
            return;
        }
        //single element or multiple elements
        // for a single element -> if deleted -> head because null
        // for multiple elements -> if deleted -> head is the next
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        // Empty list -> give a message to user & retuen to main
        if (head==null){
            System.out.println("Empty list . Can't remove tail");
            return;
        }
        //single element
        if (head.next==null){
            head=null;
            size--; // one node deleted
            return;
        }
        // for a multiple elements we need to find the
        // we use two pointer approach
        Node SecondLast=head;
        Node last = head.next;
        while (last.next!=null){
           SecondLast = last;
           last=last.next;
        }
        // after this loop is over ,we will be at the corrcet
        // second last & last node respectively
        SecondLast.next=null;

    }
    public void deleteTargetNode(String target){
        // Empty list -> cannot remove target
        if (head==null){
            System.out.println("Empty list . Can't remove target");
            return;
        }
        // Case where head is the target node
        if (head.data.equals(target)){
            head=head.next;
            size--;
            return;
        }
        //Case where the target is anywhere else in the list
        //TWO Pointer approach
        Node previous=null;
        Node current =head;
        while (current!=null &&! current.data.equals(target)){
            previous=current;
            current=current.next;
        }
        //Check for null-> then we pass a mssg -> target not found
        if (current==null){
            System.out.println("Target:" + target+ "not found in th list");
        }
        //If founf make adjustmaent to the node & pointers
        previous.next=current.next;
        size--;
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("ECE");
        sll.addFirst("&");
        sll.addFirst("EEE");
        sll.addFirst("Semester");
        sll.addFirst("6th");
        sll.addFirst("is");
        sll.addFirst("This");
        sll.addlast("Java");
        sll.addlast("DSA");
        sll.addlast("Training");
        sll.addlast("By Tripillar Solutions");
        sll.removeFirst();
        sll.removeLast();
        sll.deleteTargetNode("EEE");
        sll.printlist();
    }
}

