package com.advanced.dsa.dataStructures.linear.stacks;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1; // initially the stack is empty so -1
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX_SIZE-1;
    }
    public void push(String data){
        if (isFull()){
            System.out.println("Stack overflow." + "Can't push more elements");
            return;
        }
        arr[++top] = data; // Increment the top & add the element at that index
        System.out.println("The string" + data + " was pushed to the stack");

    }
    public String pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow . Can't pop elements");
            return null; // because it's string so we return null

        }
        String popped = arr[top];
        return popped;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Stack underflow . Can't display anything.");
            return;
        }
        System.out.println("The stack elements from top to bottom(LIFO:");
        for (int i=top;i>=0;i--){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public String peek(){
        if (isEmpty()){
            System.out.println("Stack Underflow . No top element.");
            return null;
        }
        return arr[top];
    }
    public int size(){
        // No elements
        //Single elememts
        // Multiple elements
        return top + 1; // one formula for all cases

    }

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        // stack.pop();
        stack.push(" Bangaradha Manushya");
        stack.push(" Apthamitra");
        stack.push(" Appu");
        System.out.println(stack.peek());
        String popped = stack.pop();
        System.out.println("Popped "+ popped);
        System.out.println("Size: "+ stack.size());
    }
}
