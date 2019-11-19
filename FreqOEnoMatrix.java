package Matrices;

//10. To find frequency of odd and even numbers in given matrix

public class FreqOEnoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows, cols, countOdd = 0,countEven = 0;
		
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		
		rows = a.length;
		cols = a[0].length;
		
		System.out.println("Matrix : ");
		//For matrix
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < rows ; i++) {
			for(int j = 0; j < cols; j++) {
				
				if(a[i][j] % 2 == 0)
					countEven++;
				else
					countOdd++;
				
			}
		}
		System.out.println("Freq. of Odd no. : " + countOdd);
		System.out.println("Freq. of Even no. : " + countEven);
	}
}

/*
Matrix : 
1 3 4 
2 4 3 
3 4 5 
Freq. of Odd no. : 5
Freq. of Even no. : 4
*/