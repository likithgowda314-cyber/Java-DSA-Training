package com.advanced.dsa.dataStructures.nonLinear.Trees.Traversal.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinaryTree {
    public static void LevelOrderTraversalOrBFS(TreeNode root){
        //Base case // Corner Case // Edge case
        if(root==null){
            return;
        }
        // You are pushing nodes not numbers
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while ((!queue.isEmpty())){
            TreeNode temp = queue.poll();  // Front Node// poll means pop
            System.out.print(temp.data+" ");
            // left  Subtree
            if (temp.left!=null){
                queue.add(temp.left);
            }
            // right Subtree
            if (temp.right!=null){
                queue.add(temp.right);
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.right.left=new TreeNode(9);
        root.right.right.left=new TreeNode(15);
        System.out.print("Level order or BFS : ");
        LevelOrderTraversalOrBFS(root);
    }

}
