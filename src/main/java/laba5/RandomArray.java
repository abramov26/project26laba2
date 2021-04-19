package laba5;

public class RandomArray {
	public static int[] generateArray() {
		int[] myArray = new int[8];
		Random arr = new Random();
		for (int i = 0; i < 8; i++) {
			myArray[i] = arr.getRandomNums();
		}
		return myArray;
	}
}