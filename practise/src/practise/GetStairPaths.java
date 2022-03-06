package practise;

import java.util.*;

public class GetStairPaths {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0) {
        	ArrayList<String> list = new ArrayList<>();
        	list.add("");
        	return list;
        } else if(n<0) {
        	ArrayList<String> list = new ArrayList<>();
        	return list;
        }
        
        ArrayList<String> list1 = getStairPaths(n-1);
        ArrayList<String> list2 = getStairPaths(n-2);
        ArrayList<String> list3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        for(String path: list1) {
        	paths.add("1"+path);
        }
        for(String path: list2) {
        	paths.add("2"+path);
        }
        for(String path: list3) {
        	paths.add("3"+path);
        }
        return paths;
    }

}
