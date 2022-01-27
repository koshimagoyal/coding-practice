package practise;

import java.util.Scanner;

public class CountMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int m = sc.nextInt();
		    for(int i=0;i<n;i++) {
		        arr[i] = sc.nextInt();
		    }
		    int MAX = arr[0]; 
            for (int i = 1; i < n; i++) 
                MAX = Math.max(arr[i], MAX); 
      
            int cnt[] = new int[MAX + 1]; 
            int ans[] = new int[MAX + 1]; 
            for (int i = 0; i < n; ++i)  {
                ++cnt[arr[i]]; 
            }
                
            for (int i = 1; i <= MAX; ++i) 
                for (int j = i; j <= MAX; j += i) {
                    ans[i] += cnt[j];
                    System.out.println(i+" "+ans[i]+" "+j+" "+cnt[j]);
                }
		    for(int i=0;i<m;i++) {
		        int q = sc.nextInt();
		        if(q>MAX||q<1) {
		            System.out.print("0 ");
		        } else {
		            System.out.print(ans[q]+" ");
		        }
		    }
		    System.out.println();
		    t--;
		}
		sc.close();
	}

}
