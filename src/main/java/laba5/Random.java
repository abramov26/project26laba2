package laba5;

public class Random {

	public int getRandomNums() {
		int a = 48; // ��������� �������� ��������� - "��"
		int b = 560; // �������� �������� ��������� - "��"

		int random_number = a + (int) (Math.random() * b); // ��������� �����
		return random_number;
	}

}