package Matrices;

//4. To check matrix is a sparse matrix

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, cols, size, count = 0;
		
		int a[][] = {{4,0,0},{0,5,0},{0,0,6}};
		
		rows = a.length;
		cols = a[0].length;
		
		size = rows * cols;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(a[i][j] == 0) {
				count++;	
				}
			}
		}
		
		System.out.println("Given Matrix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		if(count > (size/2))
			System.out.println("Given Matrix is a Sparse Matrix.");
		else
			System.out.println("Not Sparse Matrix.");
	}

}

/*
Given Matrix : 
4 0 0 
0 5 0 
0 0 6 
Given Matrix is a Sparse Matrix.
*/
