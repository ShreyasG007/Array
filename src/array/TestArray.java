package array;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter how many elements you want in a array :");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		

		System.out.println("Accept array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Display array elements");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");

		}
		System.out.println();

		System.out.println("Enter new element insert in array");
		int num = scanner.nextInt();

		System.out.println("Enter on which position you want to add that number index starts from 0");
		int position = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			if (i == position) {
				arr[i] = num;
			}
		}
		System.out.println("Display array elements after adding new elements");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");

		}
		System.out.println();

		System.out.println("Enter the position (0-based index) of the element you want to delete:");
		int delPosition = scanner.nextInt();

		for (int i = delPosition; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		
		n--;

		System.out.println("Display array elements after deleting the element:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");

		}
		System.out.println();
		scanner.close();
	}

}
