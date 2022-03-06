package practise;

import java.util.*;

public class GetMazePaths {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(getMazePaths(1,1,n,m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
        	ArrayList<String> paths = new ArrayList<>();
        	paths.add("");
        	return paths;
        }
        ArrayList<String> hPath = new ArrayList<>();
        ArrayList<String> vPath = new ArrayList<>();
        if(sc<dc) {
        	hPath = getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr) {
        	vPath = getMazePaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String path:hPath) {
        	paths.add("h"+path);
        }
        for(String path:vPath) {
        	paths.add("v"+path);
        }
        return paths;
    }

}
