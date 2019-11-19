package Matrices;

//6. To determine whether a given matrix is an identity matrix

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows,cols;
		boolean flag = true;
		
		int a[][] = {{1,0,0},
					{0,1,0},
					{0,0,1}};
		
		rows = a.length;
		cols = a[0].length;
		
		System.out.println("Given Matrix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		if(rows != cols) {
			System.out.println("Matrix should be a Square Matrix");
		}
		else {
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
				if(i == j && a[i][j] != 1) {
					flag = false;
					break;
				}
				if(i != j && a[i][j] != 0) {
					flag = false;
					break;
				}
				}
			}
			if(flag) {
				System.out.println("Matrix is an Identity");
			}
			else {
				System.out.println("Matrix is not an Indentity");
			}
		}

	}

}

/*
Given Matrix : 
1 0 0 
0 1 0 
0 0 1 
Matrix is an Identity
*/
