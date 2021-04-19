package laba5;

public class Bubblesort {
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aj = array[j];
					int ai = array[i];
					array[j] = ai;
					array[i] = aj;
				}
			}
		}
		return array;
	}
}