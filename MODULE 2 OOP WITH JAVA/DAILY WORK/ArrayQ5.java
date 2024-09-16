package org.Assignment6;

import java.util.*;

public class ArrayQ5 {
	public static List<Integer> findIntersection(int[] array1, int[] array2) {
		Set<Integer> set1 = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		for (int num : array1) {
			set1.add(num);
		}

		for (int num : array2) {
			if (set1.contains(num)) {
				result.add(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7 };

		List<Integer> intersection = findIntersection(array1, array2);

		System.out.println("Intersection of two arrays: " + intersection);
	}
}