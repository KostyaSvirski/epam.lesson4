package by.svirski.lesson4.task1.utils;

import by.svirski.lesson4.task1.entity.CustomArray;

public class RealisationOfSorting {

	public static CustomArray bubbleMethod(CustomArray arrayToSort) {
		for (int i = 0; i < arrayToSort.getLength() - 1; i++) {
			for (int j = i + 1; j < arrayToSort.getLength(); j++) {
				if (arrayToSort.getElementByIndex(i) > arrayToSort.getElementByIndex(j)) {
					swapElements(arrayToSort, i, j);
				}
			}
		}
		return arrayToSort;
	}

	public static CustomArray shellMethod(CustomArray arrayToSort) {
		int interval = arrayToSort.getLength() / 2;
		while (interval >= 1) {
			for (int i = 0; i < arrayToSort.getLength(); i++) {
				for (int j = i - interval; j >= 0; j -= interval) {
					if (arrayToSort.getElementByIndex(j) < arrayToSort.getElementByIndex(j + interval)) {
						swapElements(arrayToSort, j, j + interval);
					}
				}
			}
			interval /= 2;
		}
		return arrayToSort;
	}

	public static CustomArray insertionMethod(CustomArray arrayToSort) {
		for (int i = 0; i < arrayToSort.getLength(); i++) {
			int value = arrayToSort.getElementByIndex(i);
			int j = i - 1;
			for (; j >= 0; j--) {
				if (value < arrayToSort.getElementByIndex(j)) {
					arrayToSort.setElementByIndex(arrayToSort.getElementByIndex(j), j + 1);
				} else {
					break;
				}
			}
			arrayToSort.setElementByIndex(value, j + 1);
		}
		return arrayToSort;
	}

	private static void swapElements(CustomArray arrayToSort, int i, int j) {
		int temp = arrayToSort.getElementByIndex(i);
		arrayToSort.setElementByIndex(arrayToSort.getElementByIndex(j), i);
		arrayToSort.setElementByIndex(temp, j);
	}

}
