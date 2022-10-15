package assignment;

import java.util.Scanner;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int limit = sc.nextInt();
		int table = n;
		for(int i=1;table<=limit;i++) {
			table = n*i;
			if(table<=limit) {
				System.out.println(table);
			}
		}
		sc.close();
	}

}
