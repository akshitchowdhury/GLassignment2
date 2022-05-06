package com.assignmentQ2;

public class BSTconverter {
	 Node root;
	    static Node newroot,curr;
	    public static class Node{
	        Node left,right;
	        int data;
	        Node(int data){
	            this.data = data;
	            this.left = null;
	            this.right = null;
	        }
	    }
	    /*public void inorderTraversal(Node root){
	        if(root==null){
	            return;
	        }
	        inorderTraversal(root.left);
	        System.out.print(root.data +" ");
	        inorderTraversal(root.right);
	    }*/
	    public void bsttoSkew( Node root){
	        if(root==null){
	            return ;
	        }
	        bsttoSkew(root.left);
	        if(curr==null){
	            curr =root;
	            newroot = root;
	        }
	        else{
	            curr.right=root;
	            curr.left=null;
	            curr=curr.right;
	        }
	        bsttoSkew(root.right);

}
}
