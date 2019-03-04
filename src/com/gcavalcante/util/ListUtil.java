package com.gcavalcante.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

	private ListUtil() {
	}

	public static List<Integer> generateOrderedListOfIntegers(int listSize) {
		List<Integer> list = new ArrayList<Integer>(listSize);

		for (int i = 0; i < listSize; i++) {
			list.add(i);
		}

		return list;
	}

}
