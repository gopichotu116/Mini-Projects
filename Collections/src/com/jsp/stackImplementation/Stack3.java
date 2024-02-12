package com.jsp.stackImplementation;

public class Stack3<E> {
	private int count = 0;

	public synchronized E pop() {
		E obj;
		int len = size();

		obj = peek();
//        removeElementAt(len - 1);

		return obj;
	}

	private int size() {
		return count;
	}

	private E peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
