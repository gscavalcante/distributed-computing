package com.gcavalcante.garg.unit1.exercise5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Exercise5Test {

	@Test
	void test() {
		int listSize = 1_000_000;
		int search = 500;
		
		Exercise5 exercise5 = new Exercise5(listSize);

		int result = exercise5.search(search);
		assertEquals(search, result);
	}

}
