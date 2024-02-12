package com.jsp.binarySearchTree_2;

public class Demo 
{
	public static void main(String[] args) 
	{
		BinarySearchTree b = new BinarySearchTree();
		b.add(50);
		b.add(70);
		b.add(20);
		b.add(10);
		b.add(60);
		b.add(90);
		b.add(30);
		b.levelOrder();
		b.preOrder();
		b.postOrder();
		b.inOrder();
	}

}
