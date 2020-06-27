package by.svirski.lesson4.task2.main;

import by.svirski.lesson4.task2.service.DirectorService;
import by.svirski.lesson4.task2.utils.conditions.ConditionsOfSorting;
import by.svirski.lesson4.task2.utils.exception.ProjectException;
import by.svirski.lesson4.task2.utils.printer.PrinterForArray;

public class Main {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		try {
			int[][] result = ds.bubbleSortAscending(ConditionsOfSorting.SORTING_BY_SUM, 5, false);
			System.out.println(PrinterForArray.print(result));
		} catch (ProjectException e) {
			e.printStackTrace();
		}
		
		

	}

}
