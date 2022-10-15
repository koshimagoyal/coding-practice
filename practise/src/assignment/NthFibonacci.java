package assignment;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long first = 0;
		long next = 1;
		long count = 0;
		while(count<n) {
			long temp = first+next;
			first = next;
			next = temp;
			count++;
		}
		System.out.println(first);
		sc.close();
	}

}
