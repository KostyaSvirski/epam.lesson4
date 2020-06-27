package by.svirski.lesson4.task2.service;

import by.svirski.lesson4.task2.utils.conditions.ConditionsOfSorting;

public class SortingService {

	public static int[][] sort(int[][] sourceArray, ConditionsOfSorting condition, boolean needReverse) {
		for (int i = 0; i < sourceArray.length - 1; i++) {
			int reference = condition.conditionToSort(sourceArray[i]);
			for (int j = i + 1; j < sourceArray.length; j++) {
				int checkedLine = condition.conditionToSort(sourceArray[j]);
				if (reference < checkedLine) {
					sourceArray = swapLines(sourceArray, i, j);
				}
			}

		}
		if (needReverse) {
			int[][] reversedArray = reverseArray(sourceArray);
			return reversedArray;
		} else {
			return sourceArray;
		}

	}

	private static int[][] reverseArray(int[][] sourceArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			int[] line = sourceArray[i];
			sourceArray[i] = sourceArray[sourceArray.length - i - 1];
			sourceArray[sourceArray.length - i - 1] = line;
		}
		return sourceArray;
	}

	private static int[][] swapLines(int[][] sourceArray, int i, int j) {
		int[] tempLine = sourceArray[i];
		sourceArray[i] = sourceArray[j];
		sourceArray[j] = tempLine;
		return sourceArray;
	};

}
