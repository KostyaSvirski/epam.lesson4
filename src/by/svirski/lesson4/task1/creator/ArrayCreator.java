package by.svirski.lesson4.task1.creator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import by.svirski.lesson4.task1.entity.CustomArray;

public class ArrayCreator {
	
	

	public static CustomArray createArray(int[] values) {
		CustomArray newArray = new CustomArray(values);
		return newArray;
	}

	public static CustomArray createArray(int size) {
		CustomArray newArray = new CustomArray(size);
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			newArray.putElementByIndex(random.nextInt(), i);
		}
		return newArray;
	}

	public static CustomArray createArray(String file) {
		Path path = Paths.get(file);
		List<String> params;
		try {
			params = Files.readAllLines(path);
			String values = params.get(0);
			String[] valuesArray = values.split(" ");
			
			CustomArray newArray = new CustomArray(valuesArray.length);
			for (int i = 0; i < valuesArray.length; i++) {
				newArray.putElementByIndex(Integer.parseInt(valuesArray[i]), i);
			}
			return newArray;
		} catch (IOException e) {
			int[] array = new int[1];
			array[0] = -1;
			CustomArray defaultArray= new CustomArray(array); 
			return defaultArray;
		}
	}

	public static CustomArray createArray() {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		CustomArray newArray = new CustomArray(size);
		for (int i = 0; i < size; i++) {
			newArray.putElementByIndex(scanner.nextInt(), i);
		}
		scanner.close();
		return newArray;
	}

}
