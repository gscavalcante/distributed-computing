package com.gcavalcante.garg.unit1.exercise5;

import java.util.List;
import java.util.ListIterator;

public class SearchAsc extends Search {

	public SearchAsc(List<Integer> list, Integer searchedNumber) {
		super(list, searchedNumber);
	}

	@Override
	public void run() {
		indexResult = -1;
		ListIterator<Integer> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			if (Thread.currentThread().isInterrupted()) {
				break;
			}

			int nextIndex = listIterator.nextIndex();

			if (listIterator.next().equals(searchedNumber)) {
				thread.interrupt();
				indexResult = nextIndex;
				break;
			}
		}
	}

}
