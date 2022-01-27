package practise;

import java.util.LinkedList;
import java.util.Scanner;

public class BuiltInLinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list.toString());
		list.addFirst(3);
		list.addLast(8);
		System.out.println(list.toString());
		list.remove();
		System.out.println(list.toString());
		list.removeFirst();
		System.out.println(list.toString());
		list.removeLast();
		System.out.println(list.toString());
		sc.close();
	}

}
