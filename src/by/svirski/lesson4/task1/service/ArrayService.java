package by.svirski.lesson4.task1.service;

import java.util.ArrayList;

import by.svirski.lesson4.task1.entity.CustomArray;
import by.svirski.lesson4.task1.utils.ProjectException;
import by.svirski.lesson4.task1.utils.RealisationOfSorting;

public class ArrayService {

	public static final int QUANTITY_OF_DIGITS = 3;

	public static CustomArray sortingArray(CustomArray sourceArray, int typeOfSorting)
			throws CloneNotSupportedException {
		CustomArray arrayToSort = sourceArray.clone();
		switch (typeOfSorting) {
		case 1:
			arrayToSort = RealisationOfSorting.bubbleMethod(arrayToSort);
			break;
		case 2:
			arrayToSort = RealisationOfSorting.insertionMethod(arrayToSort);
			break;
		case 3:
			arrayToSort = RealisationOfSorting.shellMethod(arrayToSort);
			break;
		default:
			return sourceArray;
		}
		return sourceArray;
	}

	public static int binarySearchWrapper(CustomArray sourceArray, int key) throws CloneNotSupportedException {
		CustomArray sortedArray = sortingArray(sourceArray, 1);
		int valueSearched = binarySearch(sortedArray, key, 0, sortedArray.getLength() - 1);
		return valueSearched;
	}

	private static int binarySearch(CustomArray sourceArray, int key, int left, int right) {
		int mid = left + (right - left) / 2;
		if (left >= right) {
			return -1;
		}
		if (sourceArray.getElementByIndex(mid) == key) {
			return mid;
		} else if (sourceArray.getElementByIndex(mid) < key) {
			return binarySearch(sourceArray, key, mid + 1, right);
		} else {
			return binarySearch(sourceArray, key, left, mid);
		}

	}

	public static int[] findMinMaxElement(CustomArray sourceArray) {
		int[] result = new int[2];
		int min = sourceArray.getElementByIndex(0);
		int max = min;
		for (int i = 0; i < sourceArray.getLength(); i++) {
			int elementToCheck = sourceArray.getElementByIndex(i);
			if (elementToCheck > max) {
				max = elementToCheck;
			} else if (elementToCheck < min) {
				min = elementToCheck;
			}
		}
		result[0] = max;
		result[1] = min;
		return result;
	}

	
	public static ArrayList<Integer> findPrimeNumbersWrapper(CustomArray sourceArray) throws ProjectException {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 0; i < sourceArray.getLength(); i++) {
			int elementToCheck = sourceArray.getElementByIndex(i);
			if (primeNumber(elementToCheck)) {
				primeNumbers.add(elementToCheck);
			}
		}
		if (primeNumbers.isEmpty()) {
			throw new ProjectException("no prime numbers found");
		}
		return primeNumbers;
	}

	private static boolean primeNumber(int elementToCheck) {
		for (int divider = 2; divider <= Math.sqrt(elementToCheck); divider++) {
			if (elementToCheck % divider == 0) {
				return true;
			}
		}
		return false;
	}

	
	public static ArrayList<Integer> findFibonacciNumbersWrapper(CustomArray sourceArray) throws ProjectException {
		ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
		for (int i = 0; i < sourceArray.getLength(); i++) {
			int elementToCheck = sourceArray.getElementByIndex(i);
			if (fibonacciNumber(elementToCheck)) {
				fibonacciNumbers.add(elementToCheck);
			}
		}
		if (fibonacciNumbers.isEmpty()) {
			throw new ProjectException("no fib numbers found");
		}
		return fibonacciNumbers;
	}

	private static boolean fibonacciNumber(int elementToCheck) {
		double tempExpression = 5 * Math.pow(elementToCheck, 2);
		return (perfectRoot(tempExpression + 4) || perfectRoot(tempExpression - 4));
	}

	private static boolean perfectRoot(double d) {
		double root = Math.sqrt(d);
		return Double.compare(root, Math.floor(root)) == 0;
	}

	
	public static ArrayList<Integer> findNumbersSameDigitsWrapper(CustomArray sourceArray) {
		ArrayList<Integer> numbersWithSameDigits = new ArrayList<Integer>();
		for (int i = 0; i < sourceArray.getLength(); i++) {
			int elementToCheck = sourceArray.getElementByIndex(i);
			if (sameDigitNumber(elementToCheck)) {
				numbersWithSameDigits.add(elementToCheck);
			}
		}
		return numbersWithSameDigits;
	}

	private static boolean sameDigitNumber(int elementToCheck) {
		String elementString = Integer.toString(elementToCheck);
		if (elementString.length() == QUANTITY_OF_DIGITS) {
			if (findSameDigits(elementString)) {
				return true;
			}
		}
		return false;
	}

	private static boolean findSameDigits(String elementString) {
		if(elementString.length() == 1) {
			return true;
		}
		if (elementString.substring(0, 1).equalsIgnoreCase(elementString.substring(1, 2))) {
			return findSameDigits(elementString.substring(1));
		}
		return false;
	}
	
}
