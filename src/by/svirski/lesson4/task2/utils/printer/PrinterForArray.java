package by.svirski.lesson4.task2.utils.printer;

public class PrinterForArray {

	public static String print(int[][] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("Array { \n");
		for (int i = 0; i < array.length; i++) {
			sb.append("[");
			for (int j = 0; j < array[i].length; j++) {
				sb.append(array[i][j]);
				sb.append(", ");
			}
			sb.append("] \n");
		}
		sb.append("} \n");
		return sb.toString();
	}

}
