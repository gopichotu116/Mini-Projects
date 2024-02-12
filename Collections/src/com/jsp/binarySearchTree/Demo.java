package com.jsp.binarySearchTree;

public class Demo
{
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.add(50);
		b.add(70);
		b.add(20);
		b.add(90);
		b.add(10);
		b.add(30);
		b.add(60);
		b.levelOrder();
		System.out.println("--------------------------------------------------");
		b.postOrder();
		System.out.println("----------------------------------------------");
		b.preOrder();
		System.out.println("--------------------------------------------");
		b.inOrder();
	}

}
