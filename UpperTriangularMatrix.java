package Matrices;

//8. To display Upper triangular matrix 

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, cols;
		
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		
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
			
			System.out.println("Upper Triangular Matrix");
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
				
				if(i > j) {
					System.out.print("0 ");
				}
				else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
  }
}

/*
Given Matrix : 
1 3 4 
2 4 3 
3 4 5 
Upper Triangular Matrix
1 3 4 
0 4 3 
0 0 5 
*/
