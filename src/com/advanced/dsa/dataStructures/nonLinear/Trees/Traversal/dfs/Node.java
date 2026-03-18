package com.advanced.dsa.dataStructures.nonLinear.Trees.Traversal.dfs;

public class Node {
    int data; // the data of the node
    Node left; // the address of the left node
    Node right; // the address of the right child
    Node(int data){
        this.data=data;
        this.left=this.right=null; //Node has no children initially
    }
    public static void preorder(Node root){
        if (root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root){
        if (root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

    }
    public static void postorder(Node root){
        if (root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }
    }
    public static void main(String[] args) {
        // Construct the binary tree
        // we must construct the tree from
        // Top-> bottom ,left_>right,level by level
        // Level - 0
        Node root = new Node(1);
        // Level - 1
        root.left=new Node(2);
        root.right=new Node(3);
        //level -2
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //Level 3
        root.left.right.left=new Node(9);
        root.right.right.left=new Node(15);
        System.out.print("preorder Treversal : ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder Treversal : ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder Treversal : ");
        postorder(root);
    }
}
