package com.jsp.binarySearchTree_2;

import java.util.*;

public class BinarySearchTree 
{
	private Node root=null;
	private int count=0;
	private boolean flag=false;
	private Comparator c;
	public BinarySearchTree() {}
	
	public BinarySearchTree(Comparator c) {
		this.c=c;
	}
	
	public boolean add(Object k) {
		root=addNode(root,k);
		return flag;
	}
	
	private Node addNode(Node n,Object k) {
		if(n==null) {
			n=new Node(k);
			flag=true;
			count++;
			return n;
		}
		if(compareKeys(k,n.key)<0) {
			n.left=addNode(n.left,k);
		}
		else if(compareKeys(k,n.key)>0) {
			n.right=addNode(n.right,k);
		}
		else flag=false;
		return n;
	}
	private int compareKeys(Object k1,Object k2) {
		if(c!=null) {
			return c.compare(k1, k2);
		}
		return ((Comparable)k1).compareTo(k2);
	}
	
	public void levelOrder() {
		Queue<Node> n=new LinkedList<Node>();
		if(root!=null) n.add(root);
		while(!n.isEmpty()) {
			Node e=n.poll();
			System.out.print(e.key+" ");
			if(e.left!=null) n.add(e.left);
			if(e.right!=null) n.add(e.right);
		}
		System.out.println();
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
	public boolean isEmpty() {
		return size()==0;
	}
	
	public int size() {
		return count;
	}
}










