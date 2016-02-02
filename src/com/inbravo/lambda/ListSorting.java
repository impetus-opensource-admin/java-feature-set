package com.inbravo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author amit.dixit
 *
 */
public final class ListSorting {

	public static final void main(final String... args) {

		System.out.println(oldSort(Arrays.asList("peter", "anna", "mike", "xenia")));
		System.out.println(newSort(Arrays.asList("peter", "anna", "mike", "xenia")));
	}

	/**
	 * Convention sort using anonymous class
	 * 
	 * @param inputList
	 * @return
	 */
	public static final List<String> oldSort(final List<String> inputList) {

		Collections.sort(inputList, new Comparator<String>() {

			@Override
			public int compare(final String a, final String b) {
				return b.compareTo(a);
			}
		});

		return inputList;
	}

	/**
	 * Sort using LAMBDA
	 * 
	 * @param inputList
	 * @return
	 */
	public static final List<String> newSort(final List<String> inputList) {

		Collections.sort(inputList, (a, b) -> b.compareTo(a));

		return inputList;
	}
}