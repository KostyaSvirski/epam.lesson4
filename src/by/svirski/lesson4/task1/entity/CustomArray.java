package by.svirski.lesson4.task1.entity;

public class CustomArray implements Cloneable {

	private int[] defaultArray;

	public CustomArray() {
		
	}

	public CustomArray(int size) {
		defaultArray = new int[size];
	}

	public CustomArray(int[] defaultArray) {
		this.defaultArray = defaultArray;
	}

	public int getElementByIndex(int i) {
		return defaultArray[i];
	}

	public void setElementByIndex(int value, int i) {
		defaultArray[i] = value;
	}
	
	public int getLength() {
		return defaultArray.length;
	}
	
	public CustomArray clone() throws CloneNotSupportedException{
		return (CustomArray) super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		int resultTemp = 1;
		for (int i : defaultArray) {
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
		if (other.defaultArray.length != defaultArray.length) {
			return false;
		}
		for (int i = 0; i < defaultArray.length; i++) {
			if (other.defaultArray[i] != defaultArray[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomArray [defaultArray=");
		for(int i : defaultArray) {
			builder.append(i);
			builder.append(" ");
		}
		builder.append("]");
		return builder.toString();
	}

}
