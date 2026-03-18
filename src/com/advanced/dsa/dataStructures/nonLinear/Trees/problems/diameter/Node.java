package com.advanced.dsa.dataStructures.nonLinear.Trees.problems.diameter;

public class Node {
    int data ;
    Node left;
    Node right;
    static int diameter =0;
    Node(int data){
        this.data=data;
        this.left =this.right=null;
    }
    public static int findheight(Node root){
        if (root==null){
            return 0;
        }
        int leftheight = findheight(root.left);
        int rightheight = findheight(root.right);
        diameter = Math.max(diameter,leftheight+rightheight); // Exclude
       // diameter = Math.max(diameter,leftheight+rightheight+1); //Include

        return Math.max(leftheight,rightheight)+1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.right .right = new Node(4);
        root.right.right.right=new Node(5);
        System.out.println("height:"+ findheight(root));
        System.out.println("diameter:"+diameter);

    }
}
