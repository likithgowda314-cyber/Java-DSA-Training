package com.advanced.dsa.dataStructures.nonLinear.bst;

import com.sun.source.tree.Tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

    public class BinarySearchTree {
        public static void inorder(TreeNode root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

    public static TreeNode insert(TreeNode root,int key){
        if (root==null){
            // the new node will become the root node
            return new TreeNode(key);
        }
        if (key< root.data){
            root.left=insert(root.left,key);
        }else if (key> root.data){
            root.right=insert(root.right,key);
        }
        return root; // this is the only access to the tree
    }
    public static TreeNode search(TreeNode root , int key){
        // case 1-> tree is empty
        // case 2 -> data of root is the key
        if (root==null || key==root.data){
            return root;
        }
        if (root.data<key){
            return search( root.right,key);
        }
        return search(root.left,key);
    }
    public static TreeNode findMin(TreeNode root){
            TreeNode curr =root;
            while(curr!=null && curr.left!=null){
                curr=curr.left;
            }
            return curr;

    }
    public static TreeNode findMax(TreeNode root){
            TreeNode curr =root;
            while(curr!=null && curr.right!=null){
                curr=curr.right;
            }
            return curr;
        }
    public static TreeNode delete(TreeNode root,int key){
            if(root==null){
                return root;
            }
            if (key>root.data){
                root.right=delete(root.right,key);
            } else if (key<root.data){
                root.left=delete(root.left,key);
            }else {
                if (root.left==null){
                    TreeNode temp = root.right;
                    root=null;
                    return temp;
                }else if (root.right==null){
                    TreeNode temp = root.left;
                    root=null;
                    return temp;
                }
                // Node with both the childern (both left & right exist )
                // we need to find the (in order )
                TreeNode temp = findMin(root.right);
                root.data=temp.data;
                root.right=delete(root.right, temp.data);
            }
            return root;
    }
    public static void main(String[] args) {
        TreeNode root=null;
        root=insert(root,50);
        inorder(root);
        System.out.println();
        int[] arr ={60,20,30,10,58,100};
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        int key1=50;
        int key2=99;
        TreeNode res1 = search(root,key1);
        TreeNode res2 = search(root,key2);
        System.out.println(res1!=null ? "present " : "Not present");
        System.out.println(res2!=null ? "present " : "Not present");
        root=delete(root,50);
        inorder(root);
        System.out.println();
        System.out.println("New root:"+root.data);
    }
}


