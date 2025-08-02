package myproject;

public class Arrays_2 {
	public static void main(String args[]) {
		int[][] a = {
				{2,3,4,5},{5,3,5,2}
		};
		int[][] b = {
				{4,3,6,2},{5,6,2,1}
		};
		
		int rows = a.length;
		int cols = a[0].length;
		
		int[][] sum = new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum of matrices:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(sum[i][j]+ " ");
			}
		System.out.println();
		}
	}
}
