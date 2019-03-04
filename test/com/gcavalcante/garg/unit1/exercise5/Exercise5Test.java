package com.gcavalcante.garg.unit1.exercise5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.gcavalcante.util.ListUtil;

class Exercise5Test {

	@Test
	void test() {
		int listSize = 1_000_000;
		int search = 500;

		Exercise5 exercise5 = new Exercise5(listSize);

		int result = exercise5.search(search);
		assertEquals(search, result);
	}

	@Test
	void passingTheListAndCheckingTheResult() {
		List<Integer> listOfIntegers = ListUtil.generateOrderedListOfIntegers(1_000_000);
		int search = 500;

		Exercise5 exercise5 = new Exercise5(listOfIntegers);

		int result = exercise5.search(search);
		assertEquals(search, (int) listOfIntegers.get(result));
	}
}
