package practise;
import java.util.*;

public class StateOfWakanda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int m1 = sc.nextInt();
	    int arr1[][] = new int[n1][m1];
	    for(int i=0;i<n1;i++) {
	        for(int j=0;j<m1;j++) {
	            arr1[i][j] = sc.nextInt();
	        }
	    }
	    int i=0,j=0;
	    for(int k=0;k<n1*m1&&i<n1&&j<m1;k++) {
	        if(i==n1-1||(i==0&&j!=0)) {
	            System.out.println(arr1[i][j]);
	            j++;
	            if(i<n1&&j<m1) {
	            	System.out.println(arr1[i][j]);
	            }
	            if(i==n1-1) {
	            	i--;
	            } else {
	            	i++;
	            }
	        } else if(j%2==0){
	            System.out.println(arr1[i][j]);
	            i++;
	        } else {
	        	System.out.println(arr1[i][j]);
	        	i--;
	        }
	    }
	}

}
