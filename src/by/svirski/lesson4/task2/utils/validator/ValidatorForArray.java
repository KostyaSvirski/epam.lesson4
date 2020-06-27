package by.svirski.lesson4.task2.utils.validator;

public class ValidatorForArray {

	public static boolean validate(int[][] sourceArray) {
		if (!sourceArray.equals(null) && sourceArray.length > 0) {
			for (int i = 0; i < sourceArray.length; i++) {
				if (sourceArray[i].equals(null) || sourceArray[i].length < 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
