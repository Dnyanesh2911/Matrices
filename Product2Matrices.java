package Matrices;

//3. To find product of two matrices

public class Product2Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row1, col1, row2, col2;
				
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
		
		row1 = a.length;
		col1 = a[0].length;
		
		row2 = b.length;
		col2 = b[0].length;
		
		if(col1 != row2) {
			System.out.println("Matrices cannot be Multiplied");
		}
		else {
			int product[][] = new int [row1][col2];
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < col2; j++) {
					for(int k = 0; k < row2; k++) {
						
						product[i][j] = product[i][j] + a[i][k] * b[k][j];
					}
				}
			}
			System.out.println("Product of Two Matrices :");
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < col2; j++) {
					System.out.print(product[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}

/*
Product of Two Matrices :
11 23 29 
13 28 32 
16 35 44 
 */
