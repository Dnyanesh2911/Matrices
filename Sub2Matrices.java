package Matrices;

//2. To Subtract two matrices

public class Sub2Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{4,5,6},{3,4,1},{1,2,3}};
		int b[][] = {{2,0,3},{2,3,1},{1,1,1}};
		
		int c[][] = new int[3][3];
		System.out.println("Substract of two matrices : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}


/*
Substract of two matrices : 
2 5 3 
1 1 0 
0 1 2 
 */