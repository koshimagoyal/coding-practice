package assignment;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++) {
			System.out.println(n*i);
		}
		sc.close();
	}

}
