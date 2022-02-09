package practise;

import java.util.Scanner;

public class ExitOfMatrix {

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
		
		int i=0,j=0,dir=0;
		while(true) {
			dir = (dir + a[i][j])%4;
			if(dir == 0) {
				j++;
			} else if(dir == 1) {
				i++;
			} else if(dir == 2) {
				j--;
			} else if(dir == 3){
				i--;
			}
			
			if(i<0) {
				i++;
				break;
			} else if(j<0) {
				j++;
				break;
			} else if(i>n-1) {
				i--;
				break;
			} else if(j>m-1) {
				j--;
				break;
			}
		}
		System.out.println(i+"\n"+j);
	}

}
