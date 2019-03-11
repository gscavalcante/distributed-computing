package com.gcavalcante.garg.unit1.exercise4;

public class MergeSortRunnable implements Runnable {

	private int[] arr;

	public MergeSortRunnable(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void run() {
		mergeSort(arr, 0, arr.length - 1);
	}

	private void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);

			merge(arr, left, middle, right);
		}
	}

	private void merge(int[] arr, int begin, int middle, int end) {

		// Find the sizes of both arrays
		int n1 = middle - begin + 1;
		int n2 = end - middle;

		// Create temporary arrays
		int left[] = new int[n1];
		int right[] = new int[n2];

		// Copy data to temporary arrays
		for (int i = 0; i < n1; i++)
			left[i] = arr[begin + i];
		for (int j = 0; j < n2; j++)
			right[j] = arr[middle + 1 + j];

		/* Merge the temporary arrays */

		int i = 0, j = 0;

		int k = begin;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}

			k++;
		}

		/* Copy remaining elements */
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	public int[] getArray() {
		return arr;
	}

}
