package by.svirski.lesson4.task2.creator;

import java.util.Random;

public class JaggedArrayCreator {

	public int[][] createArray(int numberOfLines) {
		Random random = new Random();
		int[][] newArray = new int[numberOfLines][];
		for (int i = 0; i < numberOfLines; i++) {
			newArray[i] = new int[random.nextInt(10) + 1];
		}
		return newArray;
	}

	public int[][] fillNumbers(int[][] newArray) {
		Random random = new Random();
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = random.nextInt(10);
			}
		}
		return newArray;
	}

}
