package practise;

import java.util.Scanner;

public class RingRotate {

	public static int[] fillOnedFromShell(int arr[][],int s) {
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int size = (maxr-minr+1)*2+(maxc-minc+1)*2-4;
		int oneD[] = new int[size];
		int k = 0;
		//left
		for(int i=minr;i<=maxr;i++) {
			oneD[k] = arr[i][minc];
			k++;
		}
		//bottom
		for(int j=minc+1;j<=maxc;j++) {
			oneD[k] = arr[maxr][j];
			k++;
		}
		//right
		for(int i=maxr-1;i>=minr;i--) {
			oneD[k] = arr[i][maxc];
			k++;
		}
		//top
		for(int j=maxc-1;j>=minc+1;j--) {
			oneD[k] = arr[minr][j];
			k++;
		}
		return oneD;
	}
	public static void rotate(int oneD[],int r) {
		r = r % oneD.length;
		if(r<0) {
			r+=oneD.length;
		}
		reverse(oneD,0,oneD.length-r-1);
		reverse(oneD,oneD.length-r,oneD.length-1);
		reverse(oneD,0,oneD.length-1);
	}
	public static void reverse(int oneD[],int start,int end) {
		while(start<end) {
			int temp = oneD[start];
			oneD[start] = oneD[end];
			oneD[end] = temp;
			end--;
			start++;
		}
	}
	public static void fillShellFromOned(int arr[][],int s,int oneD[]) {
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int k = 0;
		//left
		for(int i=minr;i<=maxr;i++) {
			arr[i][minc]=oneD[k];
			k++;
		}
		//bottom
		for(int j=minc+1;j<=maxc;j++) {
			arr[maxr][j]=oneD[k];
			k++;
		}
		//right
		for(int i=maxr-1;i>=minr;i--) {
			arr[i][maxc]=oneD[k];
			k++;
		}
		//top
		for(int j=maxc-1;j>=minc+1;j--) {
			arr[minr][j]=oneD[k];
			k++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int s = sc.nextInt();
		int r = sc.nextInt();
		int oneD[] = fillOnedFromShell(arr,s);
		rotate(oneD,r);
		fillShellFromOned(arr,s,oneD);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
