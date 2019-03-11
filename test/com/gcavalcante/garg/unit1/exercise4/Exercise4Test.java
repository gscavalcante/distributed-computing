package com.gcavalcante.garg.unit1.exercise4;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gcavalcante.util.ArrayUtil;

class Exercise4Test {

	private int[] array;

	@BeforeEach
	void setUp() throws Exception {
		array = ArrayUtil.generateUnorderedArrayOfIntegers(1_000);
	}

	@Test
	void checkIfListIsOrdered() {
		int[] sortedArray = Exercise4.sort(array);

		int number = -1;

		for (int i : sortedArray) {
			if (i >= number) {
				number = i;
			} else {
				fail("There's element on this list that is unordered.");
			}
		}
	}

}
