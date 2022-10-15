package practise;

import java.util.*;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};
		int max_profit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				max_profit += arr[i]-arr[i-1];
			}
		}
		System.out.println(max_profit);
		
	}

}
