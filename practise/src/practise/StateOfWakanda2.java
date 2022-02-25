package practise;

import java.util.Scanner;

public class StateOfWakanda2 {

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
			int k = 0;
			for(int j=i;j<n;j++) {
				System.out.println(arr[k][j]+" ");
				k++;
			}
		}
	}

}
