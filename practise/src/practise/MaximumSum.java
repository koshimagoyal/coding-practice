package practise;

import java.util.Arrays;
import java.util.*;

public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,-2,0,3};
		int k = 2, m = 3;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			for(int j=arr.length-k;j<arr.length;j++) {
				list.add(arr[j]);
			}
			for(int j=0;j<arr.length-k;j++) {
				list.add(arr[j]);
			}
			for(int j=0;j<list.size();j++) {
				arr[j]=list.get(j);
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
