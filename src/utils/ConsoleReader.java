package utils;

import java.util.Scanner;

public class ConsoleReader {

	public static int inputNaturalNumber(Scanner sc) {
		while (true) {
			System.out.println("Input natural number:");
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				if (isNaturalNumber(n)) {
					return n;
				}
			}
			System.out.println("Incorrect data! You entered not a natural number!");
			sc.nextLine();
		}
	}

	public static int[] inputArrayOfNaturalNumbers(Scanner sc) {
		System.out.println("Input size of array:");
		int n = inputNaturalNumber(sc);
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Input arr[" + i + "]:");
			arr[i] = inputNaturalNumber(sc);
		}
		return arr;
	}

	public static int inputIntegerNumber(Scanner sc) {
		while (true) {
			System.out.println("Input integer number:");
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				return n;
			}
			System.out.println("Incorrect data! You entered not a integer number!");
			sc.nextLine();
		}
	}

	public static double inputDoubleNumber(Scanner sc) {
		while (true) {
			System.out.println("Input double number(use ','):");
			if (sc.hasNextDouble()) {
				double d = sc.nextDouble();
				return d;
			}
			System.out.println("Incorrect data! You entered not a double number!");
			sc.nextLine();
		}
	}

	private static boolean isNaturalNumber(int n) {
		return n > 0;
	}
}
