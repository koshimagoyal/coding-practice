package practise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAfterIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		System.out.println("Enter numbers for array");
		int []arr = new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements "+Arrays.toString(arr));
		System.out.println("Enter number to insert");
		int k = sc.nextInt();
		System.out.println("Enter index to insert");
		int j = sc.nextInt();
		for (int i=n;i>=j+1;i--) {
			arr[i] = arr[i-1];
		}
		arr[j+1] = k;
		System.out.println("New Array Elements "+Arrays.toString(arr));
		sc.close();

	}

}
