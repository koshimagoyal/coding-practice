package practise;

public class Railway {

	public static int findPlatform(int arr[],int dep[]) {
		int no_of_platforms = 1, min_platform = 1;
		for(int i=0;i<arr.length;i++) {
			no_of_platforms = 1;
			for(int j=i+1;j<dep.length;j++) {
				if(Math.max(arr[i],arr[j])<=Math.min(dep[i],dep[j])) {	
					no_of_platforms++;
				}
			}
			min_platform = Math.max(no_of_platforms,min_platform);
		}
		return min_platform;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println(findPlatform(arr,dep));
	}

}
