package Matrices;

//9. To find Transpose of a given matrix

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int original[][] = {{1,2,3},
							{4,5,6},
							{7,8,9}};
		int transpose[][] = new int[3][3];
		
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				transpose[i][j] = original[j][i];
			}
		}
		
		System.out.println("Original Matrix : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Matrix : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}


/*
Original Matrix : 
1 2 3 
4 5 6 
7 8 9 
Transpose Matrix : 
1 4 7 
2 5 8 
3 6 9 
 */
