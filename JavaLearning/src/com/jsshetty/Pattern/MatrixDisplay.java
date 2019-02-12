package com.jsshetty.Pattern;

import java.util.Scanner;

public class MatrixDisplay {
	static int size = 0,displayNumber = 0, count = 0;
	static int[][] matrix = {};

	public static void main(String[] args) {
		size = new Scanner(System.in).nextInt();
		matrix = new int[size][size];
		count = size * size;

		int loop = (size % 2 == 0) ? size / 2 : (size + 1) / 2;
		int index = 0;
		
		while (loop-- > 0) {
			loopNumber(index++);
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%-5d", matrix[j][i]);
			}
			System.out.println("");
		}
	}

	private static void loopNumber(int loop) {
		int j = 0, k = 0;
		for (j = 0 + loop; j < size - loop; j++) {
			matrix[j][k + loop] = ++displayNumber;
			checkCount();
		}
		j--;
		for (k = 1 + loop; k < size - loop; k++) {
			matrix[j][k] = ++displayNumber;
			checkCount();
		}
		k--;
		for (j = size - 2 - loop; j >= 0 + loop; j--) {
			matrix[j][k] = ++displayNumber;
			checkCount();
		}
		j++;
		for (k = size - 2 - loop; k > 0 + loop; k--) {
			matrix[j][k] = ++displayNumber;
			checkCount();
		}
	}

	private static void checkCount() {
		if (displayNumber == count) {
			return;
		}
	}

}
