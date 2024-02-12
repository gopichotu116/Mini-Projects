package com.jsp.binarySearchTree;

import com.jsp.queuedemo.Queue3;

public class BinarySearchTree
{
	private Node root=null;
	private int count=0;
	private boolean flag=false;
	
	public boolean add(int k) {
		root=addNode(root,k);
		return flag;
	}
	
	private Node addNode(Node n,int k) {
		if(n==null) {
			n=new Node(k);
			flag=true;
			count++;
			return n;
		}
		if(k>n.key) {
			n.right=addNode(n.right,k);
		}
		else if(k<n.key) {
			n.left=addNode(n.left,k);
		}
		else flag=false;
		
		return n;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void levelOrder() {
		Queue3<Node> n=new Queue3<Node>();
		if(root!=null) n.add(root);
		while(!n.isEmpty()) {
			Node e=n.poll();
			System.out.print(e.key+" ");
			if(e.left!=null) n.add(e.left);
			if(e.right!=null) n.add(e.right);
		}
		System.out.println();
	}
	
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n) {
		if(n==null) return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
}







