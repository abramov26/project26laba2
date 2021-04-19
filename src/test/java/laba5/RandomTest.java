package laba5;

import org.junit.Test;

public class RandomTest {

	@Test
	public void test() {
		Random testClass = new Random();
		int var1 = testClass.getRandomNums();
		assert (var1 >= 48 && var1 <= 560);
	}

}