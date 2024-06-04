package array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int index = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Display array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("Search number in array");
		System.out.println("Enter a number to be searched");
		int num = scanner.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				index = i + 1;
				continue;
			}

		}
		if (index != -1) {
			System.out.println("Number is found at postion " + index);
		} else {
			System.out.println("Number is not found");
		}

		scanner.close();
	}
}
