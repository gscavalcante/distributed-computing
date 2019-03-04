package com.gcavalcante.garg.unit1.exercise5;

import java.util.List;

import com.gcavalcante.util.ListUtil;
/*
 * Write a program in Java that uses two threads to search for a given element
 * in a doubly linked list. One thread traverses the list in the forward
 * direction and the other. in the backward direction.
 */
public class Exercise5 {

	private List<Integer> list;

	public Exercise5(int listSize) {
		list = ListUtil.generateOrderedListOfIntegers(listSize);
	}

	public Exercise5(List<Integer> list) {
		this.list = list;
	}

	public int search(int searchedNumber) {
		Search asc = new SearchAsc(list, searchedNumber);
		Search desc = new SearchDesc(list, searchedNumber);

		Thread ascThread = new Thread(asc);
		Thread descThread = new Thread(desc);

		asc.setThread(descThread);
		desc.setThread(ascThread);

		ascThread.start();
		descThread.start();

		try {
			descThread.join();
			ascThread.join();

			int ascResult = asc.getResult();
			int descResult = desc.getResult();

			if (ascResult > 0) {
				return ascResult;
			} else {
				return descResult;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return -1;
	}
}
