package assignment;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count=0;
		long temp=n;
		while(temp>0) {
			count++;
			temp = temp/10;
		}
		int arr[] = new int[count];
		count = 0;
		while(n>0) {
			int rem = (int)n%10;
			count++;
			arr[rem-1]=count;
			n=n/10;
		}
		int inv = 0;
		for(int i=arr.length-1;i>=0;i--) {
			inv = inv*10+arr[i];
		}
		System.out.println(inv);
		sc.close();
	}

}
