package laba5; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class Subversion {

	
	JFrame main_GUI = new JFrame("subversion"); // создание графического окна
	public int[] myArray; //сюда будет записываться массив, сгенерированный с помощью RandomArray

	public Subversion() {

		main_GUI.setTitle("Using git for developers"); //создание заголовка графического окна
		main_GUI.setBounds(500, 400, 550, 575);
		main_GUI.setResizable(false); // фиксированный размер окна

		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);

		JLabel spec_info = new JLabel("Прикладная информатика"); // Отображение текста или изображения
		spec_info.setBounds(180, 0, 200, 30);
		main_panel.add(spec_info);

		JLabel laba_info = new JLabel("Лабораторная работа №3"); // Отображение текста или изображения
		laba_info.setBounds(180, 20, 200, 30);
		main_panel.add(laba_info);

		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(375, 450, 150, 40);
		ActionListener actionListener = new ListenerButton(); // создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit);

		// Костя

		JButton button_info = new JButton("Информация"); // добавляем кнопку
		button_info.setBounds(12, 450, 150, 40);
		ActionListener Listener = new Info(); // создаем слушатель
		button_info.addActionListener(Listener); // добавляем слушатель к кнопке
		main_panel.add(button_info);

		// Денис

		JLabel resultArray = new JLabel("Сгенерированный массив:"); // Отображение текста или изображения
		resultArray.setBounds(200, 330, 400, 30);
		main_panel.add(resultArray);

		JButton button_array = new JButton("Генерация массива"); // добавляем кнопку
		button_array.setBounds(12, 325, 175, 40);

		main_panel.add(button_array);

		ImagePanel imgLabel = new ImagePanel();
		imgLabel.setBounds(225, 60, 100, 50);
		imgLabel.setVisible(false);
		main_panel.add(imgLabel);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Главная");

		JMenuItem menuItem1 = new JMenuItem("Загрузить файл в проект 26");

		ActionListener uploadListener = new ActionListener() { // создание слушателя
			public void actionPerformed(ActionEvent e) {
				laba5.TextFileUpload.FileUpload();

			}
		};
		// ActionListener uploadListener = new InfoWithUpload(); // создаем слушатель
		menuItem1.addActionListener(uploadListener); // добавляем слушатель к кнопке
		fileMenu.add(menuItem1);

		JMenuItem logoItem = new JMenuItem("Отобразить логотип УГАТУ");
		logoItem.addActionListener(new ListenerButton() {
			public void actionPerformed(ActionEvent arg0) {
				imgLabel.setVisible(true);

			}
		});

		menuBar.add(fileMenu);
		main_GUI.setJMenuBar(menuBar);

		fileMenu.add(logoItem);
		fileMenu.addSeparator();

		menuBar.add(fileMenu);
		main_GUI.setJMenuBar(menuBar);

		fileMenu.add(logoItem);
		fileMenu.addSeparator();

		JTextField radiusField = new JTextField("Радиус шара");
		radiusField.setBounds(169, 150, 100, 20);
		main_panel.add(radiusField);

		JTextField heightField = new JTextField("Высота");
		heightField.setBounds(269, 150, 100, 20);
		main_panel.add(heightField);

		JLabel resultInfo = new JLabel("Значение (куб. м.):"); // Отображение текста или изображения
		resultInfo.setBounds(170, 220, 200, 30);
		main_panel.add(resultInfo);

		JButton button_calculation = new JButton("Рассчитать"); // добавляем кнопку
		button_calculation.setBounds(170, 185, 200, 30);
		button_calculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String radiusFieldinString = radiusField.getText();
				String heightFieldinString = heightField.getText();
				double radiusFieldInInt = Double.parseDouble(radiusFieldinString);
				double heightFieldInInt = Double.parseDouble(heightFieldinString);

				double resultInDouble = 2 * Math.PI * radiusFieldInInt * heightFieldInInt / 3;
				String resultInString = String.format("%.2f",resultInDouble); //вывод результата в текстовую строку и округление до 2-х знаков

				resultInfo.setText("Значение (куб. м.): " + resultInString);

			}
		});

		main_panel.add(button_calculation);

		JMenuItem exitItem = new JMenuItem("Выход");

		// Данила

		JLabel resultSortArray = new JLabel("Отсортированный массив:"); // Отображение текста или изображения
		resultSortArray.setBounds(200, 375, 400, 30);
		main_panel.add(resultSortArray);

		JButton button_sort = new JButton("Сортировка"); // добавляем кнопку
		button_sort.setBounds(12, 370, 175, 40);
		button_sort.setEnabled(false);
		main_panel.add(button_sort);

		button_sort.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Bubblesort mySort = new Bubblesort();
				int[] mySortedArray = mySort.sort(myArray);
				int a = mySortedArray.length;
				String arrayInString = "Массив: ";
				for (int i = 0; i < a; i++) {
					int resultInInt = mySortedArray[i];

					arrayInString += String.valueOf(resultInInt) + " ";

				}
				resultSortArray.setText(arrayInString);

			}

		});

		// Денис

		button_array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myArray = RandomArray.generateArray();
				int a = myArray.length;
				String arrayInString = "Массив: ";
				for (int i = 0; i < a; i++) {
					int resultInInt = myArray[i];

					arrayInString += String.valueOf(resultInInt) + " ";

				}
				resultArray.setText(arrayInString);
				button_sort.setEnabled(true);
			}
		});

		
		String[] options = { "Переместить логотип УГАТУ в верхний правый угол", "Переместить логотип УГАТУ в середину",
				"Переместить логотип УГАТУ в верхний левый угол"}; // массив значений выбора

		JComboBox<String> cb = new JComboBox<String>(options); // добавление объекта комбобокса
		ActionListener comboBoxListener = new ActionListener() { // создание слушателя
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cb.getSelectedItem();
				switch (selectedItem) {
				case "Переместить логотип УГАТУ в верхний правый угол":
					imgLabel.setLocation(400, 60);
					break;
				case "Переместить логотип УГАТУ в середину":
					imgLabel.setLocation(225, 60);
					break;
				case "Переместить логотип УГАТУ в верхний левый угол":
					imgLabel.setLocation(50, 60);
					break;
				}
			}
		};

		cb.addActionListener(comboBoxListener); // добавление слушателя к комбобоксу
		cb.setBounds(75, 250, 400, 30); // выставление размеров окна combobox
		main_panel.add(cb); // добавление combobox на панель
		fileMenu.add(exitItem);
		exitItem.addActionListener(actionListener);

		// main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java

	}

	public void setVisible() {
		main_GUI.setVisible(true); //делаем окно видимым
	}

	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		Subversion student = new Subversion();
		student.setVisible();

	}
}