package com.example.datastructure.common;

public class TreeUtil<T> {

    public static <T> void preOrderTraversal(Node<T> root){
        if(root!=null){
            System.out.println(root);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static <T> void postOrderTraversal(Node<T> root){
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root);
        }
    }

    public static <T> void inOrderTraversal(Node<T> root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.println(root);
            inOrderTraversal(root.right);
        }
    }

    public static <T> Integer height(Node<T> root){

        if(root==null){
            return 0;
        }

        int leftSubTreeHeight = 1+ (height(root.left));
        int rightSubTreeHeight = 1 + (height(root.right));

        return leftSubTreeHeight> rightSubTreeHeight ? leftSubTreeHeight : rightSubTreeHeight;
    }
}
