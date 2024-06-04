package array;

import java.util.Scanner;

public class SumOfDiagonal {

	public static void main(String[] args) {
		int row, col;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows count");
		row = scanner.nextInt();
		System.out.println("Enter column count");
		col = scanner.nextInt();

		int[][] m1 = new int[row][col];
		
		int sumOfDiagonal=0;
		int sumOfNonDiagonal=0;
		
		
		System.out.println("Enter the matrix values ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m1[i][j] = scanner.nextInt();

			}
			System.out.println(" ");
		}
		
		System.out.println("\nDisplay Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m1[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==j) {
					sumOfDiagonal += m1[i][j];
				}
				
				else
				{
					sumOfNonDiagonal += m1[i][j];
				}
			
			}
		}
		
		System.out.println("\nSum of Diagonal : "+sumOfDiagonal);
		System.out.println("Sum of Non Diagonal : "+sumOfNonDiagonal);
		scanner.close();
	}

}
