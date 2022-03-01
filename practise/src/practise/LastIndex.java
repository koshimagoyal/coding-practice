package practise;

import java.util.Scanner;

public class LastIndex {
	
	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(lastIndex(arr,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
    	if(idx == arr.length) {
        	return -1;
        }
        int no = lastIndex(arr,idx+1,x);
        if(no == -1 && arr[idx] == x) {
        	return idx;
        } else if(no>-1) {
        	return no;
        }
        return -1;
    }
	
}
