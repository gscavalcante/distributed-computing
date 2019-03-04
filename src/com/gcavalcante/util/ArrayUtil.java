package com.gcavalcante.util;

public class ArrayUtil {

	private ArrayUtil() {}
	
	public static int[] generateOrderedArrayOfIntegers(int size) {
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = i;
		}
		
		return array;
	}
	
}
