package practise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAfterIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		System.out.println("Enter numbers for array");
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements "+Arrays.toString(arr));
		System.out.println("Enter index to insert");
		int j = sc.nextInt();
		for (int i=j+2;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = 0;
		System.out.println("New Array Elements "+Arrays.toString(arr));
		sc.close();
	}

}
