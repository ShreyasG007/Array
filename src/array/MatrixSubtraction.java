package array;

import java.util.Scanner;

public class MatrixSubtraction {
	public static void main(String[] args) {
		int row, col;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows count");
		row = scanner.nextInt();
		System.out.println("Enter column count");
		col = scanner.nextInt();
		
		
		int[][] m1 = new int[row][col];
		int[][] m2 = new int[row][col];

		int[][] sub = new int[row][col];
		System.out.println("Enter first matrix values ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m1[i][j] = scanner.nextInt();

			}
			System.out.println(" ");
		}

		System.out.println("Enter Second matrix values ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m2[i][j] = scanner.nextInt();

			}
			System.out.println(" ");
		}
		
		System.out.println("\nMatrix 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\nMatrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m2[i][j] + "\t");
			}
			System.out.println();
		}


		System.out.println("Subtraction in progress");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sub[i][j] = m1[i][j] - m2[i][j];
			}
		}
		System.out.println("Subtraction Successful!!!");

		System.out.println("\nSubtraction of matrices");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(sub[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();
	}
}
