package laba5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubblesortTest {

	public static int[] rawArray = { 3, 20, 15, 4, 150 };

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Bubblesort mySort = new Bubblesort();
		int[] myArray = mySort.sort(rawArray);
		int iterationsCount = myArray.length - 1;
		for (int i = 0; i < iterationsCount; i++) {

			assert (myArray[i] > myArray[i + 1]);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Bubblesort mySort = new Bubblesort();
		int[] myArray = mySort.sort(rawArray);
		int iterationsCount = myArray.length - 1;
		for (int i = iterationsCount; i > 0; i--) {

			assert (myArray[i] < myArray[i - 1]);
		}
	}

	@Test
	public void test() {
// fail("Not yet implemented");
	}

}