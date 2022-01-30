package practise;
import java.util.*;

public class MinMax2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++) {
	      a[i] = sc.nextInt();
	    }
	    for(int i=0;i<n;i++) {
	      for(int j=1;j<=n-i-1;j++) {
	        if(a[j]<a[j-1]) {
	          int temp = a[j];
	          a[j] = a[j-1];
	          a[j-1] = temp;
	        }
	      }
	    }
	    System.out.println(a[n-2]+" "+a[1]);

	}

}
