package laba5;

public class Random {

	public int getRandomNums() {
		int a = 48; // Начальное значение диапазона - "от"
		int b = 560; // Конечное значение диапазона - "до"

		int random_number = a + (int) (Math.random() * b); // Генерация числа
		return random_number;
	}

}