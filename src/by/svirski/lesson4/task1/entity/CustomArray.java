package by.svirski.lesson4.task1.entity;

public class CustomArray implements Cloneable {

	private int[] startArray;

	public CustomArray() {
		
	}

	public CustomArray(int size) {
		startArray = new int[size];
	}

	public CustomArray(int[] defaultArray) {
		this.startArray = defaultArray;
	}

	public int takeElementByIndex(int i) {
		return startArray[i];
	}

	public void putElementByIndex(int value, int i) {
		startArray[i] = value;
	}
	
	public int calculateLength() {
		return startArray.length;
	}
	
	public CustomArray clone() throws CloneNotSupportedException{
		return (CustomArray) super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		int resultTemp = 1;
		for (int i : startArray) {
			resultTemp = prime * resultTemp + i;
		}
		result = prime * result + resultTemp;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomArray other = (CustomArray) obj;
		if (other.startArray.length != startArray.length) {
			return false;
		}
		for (int i = 0; i < startArray.length; i++) {
			if (other.startArray[i] != startArray[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomArray [defaultArray=");
		for(int i : startArray) {
			builder.append(i);
			builder.append(" ");
		}
		builder.append("]");
		return builder.toString();
	}

}
