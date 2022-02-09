package practise;

import java.util.Scanner;

public class SpiralWave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int tne = n*m;
		int count = 0;
		int minrow = 0;
		int mincol = 0;
		int maxrow = n-1;
		int maxcol = m-1;
		
		while(count<tne) {
			
			if(count<tne) {
				for(int i=minrow;i<=maxrow;i++) {
					System.out.println(a[i][mincol]);
					count++;
				}
				mincol++;
			}
			
			if(count<tne) {
				for(int j=mincol;j<=maxcol;j++) {
					System.out.println(a[maxrow][j]);
					count++;
				}
				maxrow--;
			}
			
			if(count<tne) {
				for(int i=maxrow;i>=minrow;i--) {
					System.out.println(a[i][maxcol]);
					count++;
				}
				maxcol--;
			}
			
			if(count<tne) {
				for(int j=maxcol;j>=mincol;j--) {
					System.out.println(a[minrow][j]);
					count++;
				}
				minrow++;
			}
		}
	}

}
