package com.gcavalcante.garg.unit1.exercise5;

import java.util.List;
import java.util.ListIterator;

public class SearchDesc extends Search {

	public SearchDesc(List<Integer> list, Integer searchedNumber) {
		super(list, searchedNumber);
	}

	@Override
	public void run() {
		indexResult = -1;
		ListIterator<Integer> listIterator = list.listIterator(list.size());

		while (listIterator.hasPrevious()) {
			if (Thread.currentThread().isInterrupted()) {
				break;
			}

			int nextIndex = listIterator.previousIndex();

			if (listIterator.previous().equals(searchedNumber)) {
				thread.interrupt();
				indexResult = nextIndex;
				break;
			}
		}
	}

}
