package array;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[10];
		int temp;
		int counter=0;
		int index=-1;

		System.out.println("How many element you want in array :");
		int n = scanner.nextInt();
		System.out.println("Accept elements");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Array before sorting");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\nArray After Sorting in Ascending order");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\nArray After Sorting in Descending order");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
			
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i]==arr[j]) {
					counter ++;
				}
			
			}
			
		}
		if(counter!=0)
		{
			System.out.println("duplicate number found in array");
		}
		else {
			System.out.println("duplicate number not found in array");
		}
		
		
		System.out.println("Enter a number to be searched");
		int key = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				index = i + 1;
				System.out.println("Number is found at postion " + index);
				continue;
			}
			

		}
		
		if(index==-1) {
			System.out.println("Number is not found");
		}
		
		scanner.close();
	}
}
