package practise;

import java.util.Scanner;

public class LinkedList {

	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	void createList(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	void display() {
		Node node = head;
		while(node.next!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		System.out.println("Enter numbers for list");
		LinkedList list = new LinkedList();
		for(int i=0;i<n;i++) {
			list.createList(sc.nextInt());
		}
		System.out.println("LinkedList Elements ");
		list.display();
		sc.close();
	}

}
