package practise;

import java.io.*;
import java.util.*;

public class GetSubSequence {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
    	if(str.length() == 0) {
    		ArrayList<String> result = new ArrayList<>();
    		result.add("");
    		return result;
    	}
    	char ch = str.charAt(0);
    	String sub = str.substring(1);
    	ArrayList<String> list = gss(sub);
    	ArrayList<String> result = new ArrayList<>();
    	for(int i=0;i<list.size();i++) {
    		result.add(""+list.get(i));
    	}
    	for(int i=0;i<list.size();i++) {
    		result.add(ch + list.get(i));
    	}
        return result;
    }

}
