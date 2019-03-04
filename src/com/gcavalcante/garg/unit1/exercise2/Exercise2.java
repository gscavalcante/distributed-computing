package com.gcavalcante.garg.unit1.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Write a Java class that allows parallel search in an array of integer. It
 * provides the following `static` method:
 * 
 * `public static int parallelSearch(int x, int[] a, int numThreads)`
 * 
 * This method creates as many threads as specified by numThreads, divides the
 * array A into that many parts, and gives each thread a part of the array to
 * search for sequentially. If any thread finds x, then it returns an
 * index i such that A [i] = x. Otherwise, the method returns -1.
 */
public class Exercise2 {

	public static int parallelSearch(int searchNum, int[] array, int numThreads) {
		List<Thread> threads = new ArrayList<>(numThreads);
		Map<Thread, Search> map = new HashMap<>();

		int piece = array.length / numThreads;
		for (int i = 0; i < numThreads; i++) {
			int begin = i * piece;
			int end = ((i + 1) * piece) - 1;

			Search search = new Search(searchNum, array, begin, end);
			Thread searchThread = new Thread(search);

			map.put(searchThread, search);
			threads.add(searchThread);

			searchThread.start();
		}

		return getResult(threads, map);
	}

	private static int getResult(List<Thread> threads, Map<Thread, Search> map) {
		int result = -1;

		try {
			for (Thread thread : threads) {
				thread.join();

				if (result < 0) {
					Search search = map.get(thread);
					if (search.getResult() >= 0) {
						result = search.getResult();
					}
				}
			}

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		return result;
	}

}
