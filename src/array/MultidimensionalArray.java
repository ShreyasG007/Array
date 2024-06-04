package array;

import java.util.Scanner;

public class MultidimensionalArray {
	public static void main(String[] args) {

		int m, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows count");
		m = scanner.nextInt();
		System.out.println("Enter column count");
		n = scanner.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter values ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();

			}
			System.out.println(" ");
		}
		System.out.println("Display 2 Dimensional Array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		scanner.close();
	}
}
