package Matrices;

//11. To find sum of each row and each column of a matrix

public class SumEachRCMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows, cols, sumRow, sumCol;
		
		int a[][] = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		rows = a.length;
		cols = a[0].length;
		
		System.out.println("Matrix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//row
		for(int i = 0; i < rows; i++) {
			sumRow = 0;
			for(int j = 0; j < cols; j++) {
				sumRow = sumRow + a[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " row : " + sumRow);
		}
		
		//column
		for(int i = 0; i < cols; i++) {
			sumCol = 0;
			for(int j = 0; j < cols; j++) {
				sumCol = sumCol + a[j][i];
			}
			System.out.println("Sum of " + (i + 1) + " col : " + sumCol);
		}
	}

}

/*
Matrix : 
1 2 3 
4 5 6 
7 8 9 
Sum of 1 row : 6
Sum of 2 row : 15
Sum of 3 row : 24
Sum of 1 col : 12
Sum of 2 col : 15
Sum of 3 col : 18

 */
