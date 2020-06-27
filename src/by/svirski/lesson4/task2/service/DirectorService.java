package by.svirski.lesson4.task2.service;

import by.svirski.lesson4.task2.creator.JaggedArrayCreator;
import by.svirski.lesson4.task2.utils.conditions.ConditionsOfSorting;
import by.svirski.lesson4.task2.utils.exception.ProjectException;
import by.svirski.lesson4.task2.utils.validator.ValidatorForArray;

public class DirectorService {

	public int[][] bubbleSortAscending(ConditionsOfSorting condition, int numberOfLines, boolean needReverse) throws ProjectException {
		JaggedArrayCreator creator = new JaggedArrayCreator();
		int[][] sourceArray = creator.createArray(numberOfLines);
		sourceArray = creator.fillNumbers(sourceArray);
		if (ValidatorForArray.validate(sourceArray)) {
			sourceArray = SortingService.sort(sourceArray, condition, needReverse);
			return sourceArray;
		} else {
			throw new ProjectException("not valid array");
		}
	}
	
}
