package practise;

import java.util.Scanner;

public class SaddlePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			int col = 0;
			for(int j=1;j<n;j++) {
				if(arr[i][j] < arr[i][col]) {
					col = j;
				}
			}
			boolean flag = true;
			for(int k=0;k<n;k++) {
				if(arr[k][col]>arr[i][col]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(arr[i][col]);
				return;
			}
		}
		System.out.println("Invalid input");

	}

}
