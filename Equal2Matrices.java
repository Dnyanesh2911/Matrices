package Matrices;

//5. To determine whether two matrices are equal or not equal

public class Equal2Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows1, cols1, rows2, cols2; 
		boolean flag = true;
		
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int b[][] = {{1,3,4},{2,4,3},{3,4,5}};
		
		rows1 = a.length;
		cols1 = a[0].length;
		
		rows2 = b.length;
		cols2 = b[0].length;
		
		if(rows1 != rows2 || cols1 != cols2) {
			System.out.println("Not equal");
		}
		else {
			for(int i = 0; i < rows1; i++) {
				for(int j = 0; j <cols1; j++) {
					
					if(a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
			
			
			System.out.println("Matrix A : ");
			//for A matrix
			for(int i = 0; i < rows1; i++) {
				for(int j = 0; j < cols1; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("Matrix B : ");
			//For B matrix
			for(int i = 0; i < rows2; i++) {
				for(int j = 0; j < cols2; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}
			
			if(flag)
				System.out.println("Both are Equal");
			else
				System.out.println("Not Equal");
		}
			
	}

}

/*
Matrix A : 
1 3 4 
2 4 3 
3 4 5 
Matrix B : 
1 3 4 
2 4 3 
3 4 5 
Both are Equal
*/
