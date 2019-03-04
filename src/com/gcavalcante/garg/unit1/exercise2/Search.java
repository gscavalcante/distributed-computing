package com.gcavalcante.garg.unit1.exercise2;

public class Search implements Runnable {

	private int searchNum;
	private int[] array;
	private int begin;
	private int end;
	private int result;

	public Search(int searchNum, int[] array, int begin, int end) {
		this.searchNum = searchNum;
		this.array = array;
		this.begin = begin;
		this.end = end;

		this.result = -1;
	}

	@Override
	public void run() {
		for (int i = begin; i < end; i++) {
			if (Thread.currentThread().isInterrupted()) {
				break;
			}

			if (array[i] == searchNum) {
				result = i;
			}
		}
	}

	public int getResult() {
		return result;
	}

}
