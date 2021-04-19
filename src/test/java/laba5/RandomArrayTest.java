package laba5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RandomArrayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int[] myArray = RandomArray.generateArray();
		int a = myArray.length;
		assertEquals(8, a);
		for (int i = 0; i < a; i++) {
			assertNotNull(myArray[i]);
		}

	}

	@Test
	public void test() {
	}

}