package com.gcavalcante.garg.unit1.exercise4;

import java.util.Arrays;

/*
 * Write a multithreaded program in Java that sorts an array using recursive
 * merge sort. The main thread forks two threads to sort the two halves of
 * arrays, which are then merged.
 */
public class Exercise4 {

	public static int[] sort(int[] array) {
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		MergeSortRunnable mergeSortRunnable = new MergeSortRunnable(arrayCopy);

		Thread mergeSortThread = new Thread(mergeSortRunnable);

		mergeSortThread.start();

		try {
			mergeSortThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return mergeSortRunnable.getArray();
	}

}
