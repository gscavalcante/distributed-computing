package com.gcavalcante.garg.unit1.exercise5;

import java.util.List;

public abstract class Search implements Runnable {

	protected List<Integer> list;
	protected Integer searchedNumber;
	protected int indexResult;
	protected Thread thread;

	public Search(List<Integer> list, Integer searchedNumber) {
		super();
		this.list = list;
		this.searchedNumber = searchedNumber;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public int getResult() {
		return indexResult;
	}

}
