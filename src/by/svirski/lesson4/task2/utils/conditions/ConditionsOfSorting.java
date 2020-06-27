package by.svirski.lesson4.task2.utils.conditions;

public enum ConditionsOfSorting {

	SORTING_BY_SUM {
		
		@Override
		public int conditionToSort(int[] line) {
			int sum = 0;
			for (int i : line) {
				sum += i;
			}
			return sum;
		}

	},

	SORTING_BY_MAX_VALUE {
	
		@Override
		public int conditionToSort(int[] line) {
			int max = line[0];
			for (int i : line) {
				if (i > max) {
					max = i;
				}
			}
			return max;
		}

	},

	SORTING_BY_MIN_VALUE {
	
		@Override
		public int conditionToSort(int[] line) {
			int min = line[0];
			for(int i : line) {
				if(i < min) {
					min = i;
				}
			}
			return min;
		}

	};

	public abstract int conditionToSort(int[] line);

	

}
