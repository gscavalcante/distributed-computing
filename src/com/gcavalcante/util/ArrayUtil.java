package com.gcavalcante.util;

public class ArrayUtil {

	private ArrayUtil() {
	}

	public static int[] generateOrderedArrayOfIntegers(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = i;
		}

		return array;
	}

	public static int[] generateUnorderedArrayOfIntegers(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * size);
		}

		return array;
	}

	public static void print(int[] array) {
		for (int item : array) {
			System.out.print(item + " ");
		}

		System.out.println();
	}

}
