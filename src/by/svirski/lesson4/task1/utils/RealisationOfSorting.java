package by.svirski.lesson4.task1.utils;

import by.svirski.lesson4.task1.entity.CustomArray;

public class RealisationOfSorting {

	public static CustomArray bubbleMethod(CustomArray arrayToSort) {
		for (int i = 0; i < arrayToSort.calculateLength() - 1; i++) {
			for (int j = i + 1; j < arrayToSort.calculateLength(); j++) {
				if (arrayToSort.takeElementByIndex(i) > arrayToSort.takeElementByIndex(j)) {
					swapElements(arrayToSort, i, j);
				}
			}
		}
		return arrayToSort;
	}

	public static CustomArray shellMethod(CustomArray arrayToSort) {
		int interval = arrayToSort.calculateLength() / 2;
		while (interval >= 1) {
			for (int i = 0; i < arrayToSort.calculateLength(); i++) {
				for (int j = i - interval; j >= 0; j -= interval) {
					if (arrayToSort.takeElementByIndex(j) < arrayToSort.takeElementByIndex(j + interval)) {
						swapElements(arrayToSort, j, j + interval);
					}
				}
			}
			interval /= 2;
		}
		return arrayToSort;
	}

	public static CustomArray insertionMethod(CustomArray arrayToSort) {
		for (int i = 0; i < arrayToSort.calculateLength(); i++) {
			int value = arrayToSort.takeElementByIndex(i);
			int j = i - 1;
			for (; j >= 0; j--) {
				if (value < arrayToSort.takeElementByIndex(j)) {
					arrayToSort.putElementByIndex(arrayToSort.takeElementByIndex(j), j + 1);
				} else {
					break;
				}
			}
			arrayToSort.putElementByIndex(value, j + 1);
		}
		return arrayToSort;
	}

	private static void swapElements(CustomArray arrayToSort, int i, int j) {
		int temp = arrayToSort.takeElementByIndex(i);
		arrayToSort.putElementByIndex(arrayToSort.takeElementByIndex(j), i);
		arrayToSort.putElementByIndex(temp, j);
	}

}
