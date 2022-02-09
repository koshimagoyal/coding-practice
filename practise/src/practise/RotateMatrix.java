package practise;
import java.util.*;

public class RotateMatrix {

	public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rotArr[][] = new int[n][n];
        int col = 0;
        for(int i=n-1;i>=0;i--) {
            int row = 0;
            for(int j=0;j<n;j++) {
                rotArr[row][col] = arr[i][j];
                row++;
            }
            col++;
        }
        display(rotArr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
