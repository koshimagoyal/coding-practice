package practise;

import java.util.Scanner;

public class MaxofArray {
	
	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length) {
        	return 1;
        }
        int no = maxOfArray(arr,idx+1);
        if(no > arr[idx]) {
        	return no;
        } else {
        	return arr[idx];
        }
    }
	
}
