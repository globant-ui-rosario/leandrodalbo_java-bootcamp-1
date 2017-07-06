package oop8_1;

public class MyIntStack {

	private int[] elements;
	private int top;

	public MyIntStack(int capacity) {
		elements = new int[capacity];
		top = -1;
	}

	public void push(int element) {
		top++;
		elements[top] = element;
	}

	public int pop() {
		int element = elements[top];
		top--;
		return element;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == elements.length - 1)
			return true;
		else
			return false;
	}
}
