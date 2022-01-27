package practise;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

	ArrayList<Integer> queue;
	Queue(int n) {
		queue = new ArrayList<>(n);
	}
	void enqueue(int data) {
		queue.add(data);
	}
	int dequeue() {
		if(queue.isEmpty()) {
			return -1;
		} else {
			int data = queue.get(0);
			queue.remove(0);
			return data;
		}
	}
	void display() {
		System.out.println(queue.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		Queue queue = new Queue(n);
		System.out.println("Enter numbers for queue");
		for(int i=0;i<n;i++) {
			queue.enqueue(sc.nextInt());
		}
		queue.display();
		System.out.println("Deleted element - "+queue.dequeue());
		queue.display();
		sc.close();
	}

}
