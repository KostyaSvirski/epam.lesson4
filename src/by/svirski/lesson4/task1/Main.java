package by.svirski.lesson4.task1;

import by.svirski.lesson4.task1.creator.ArrayCreator;
import by.svirski.lesson4.task1.entity.CustomArray;
import by.svirski.lesson4.task1.utils.RealisationOfSorting;

public class Main {
	
	public static void main(String[] args) {
		
		
		CustomArray array = ArrayCreator.createArray(new int[]{24, 3, 8, 3, 10});
		CustomArray newArray = RealisationOfSorting.bubbleMethod(array);
		System.out.println(array);
		System.out.println(newArray);
	}

}
