package com.gcavalcante.garg.unit1.exercise2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gcavalcante.util.ArrayUtil;

class Exercise2Test {

	private static int[] array;

	@BeforeAll
	static void setUp() throws Exception {
		array = ArrayUtil.generateOrderedArrayOfIntegers(1_000_000);
	}

	@Test
	void getResultWithTwoThreads() {
		int result = Exercise2.parallelSearch(500, array, 2);

		assertEquals(500, result);
		assertEquals(500, array[result]);
	}

	@Test
	void getResultWithFourThreads() {

		int result = Exercise2.parallelSearch(500, array, 2);

		assertEquals(500, result);
		assertEquals(500, array[result]);
	}
	
	@Test
	void getNegativeAnswerWithFourThreads() {

		int result = Exercise2.parallelSearch(-500, array, 2);

		assertEquals(-1, result);
	}


}
