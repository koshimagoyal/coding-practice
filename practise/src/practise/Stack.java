package practise;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	
	ArrayList<Integer> stack;
	Stack(int n) {
		this.stack = new ArrayList<>(n);
	}
	void push(int data) {
		this.stack.add(0,data);
	}
	
	int pop() {
		if(this.stack.isEmpty()) {
			return -1;
		} else {
			int data = this.stack.get(0);
			this.stack.remove(0);
			return data;
		}
	}
	
	void display() {
		System.out.println("Stack Elements "+this.stack.toString());
	}
	
	void peek() {
		System.out.println("Element At Top - "+this.stack.get(0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack stack = new Stack(n);
		System.out.println("Enter elements for stack");
		for(int i=0;i<n;i++) {
			stack.push(sc.nextInt());
		}
		stack.display();
		System.out.println("Remove Element - "+stack.pop());
		stack.display();
		stack.push(8);
		stack.display();
		stack.peek();
		sc.close();
	}

}
