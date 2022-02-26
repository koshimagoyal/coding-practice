package practise;

import java.util.Scanner;

public class SearchInSorted2dArray {

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
		int key = sc.nextInt();
		int row = 0;
		int col = n-1;
		while(row<n&&col>=0) {
			if(arr[row][col]==key) {
				System.out.println(row);
				System.out.println(col);
				return;
			} else if(arr[row][col]<key){
				row++;
			} else {
				col--;
			}
		}
		System.out.println("Not Found");
	}

}
