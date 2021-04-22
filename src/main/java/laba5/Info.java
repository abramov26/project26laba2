package laba5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info implements ActionListener {

	public static String importedText = "Вы можете загрузить текстовый файл и его содержимое появится здесь";

	public void actionPerformed(ActionEvent e) {
		JFrame Panel = new JFrame(); // Создание графического окна
		Panel.setTitle("Информация");
		Panel.setBounds(1000, 300, 765, 300);
		Panel.setResizable(false); // Фиксированный размер окна

		JPanel sec_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		sec_panel.setLayout(null); // Устанавливается менеджер компоновки
		Panel.add(sec_panel);

		// Добавляются члены группы
		JLabel moder = new JLabel("Модератор: Абрамов Владислав Владимирович, № зачётки 19130172. Дата работы №3: 22.04.2021.");
		moder.setBounds(30, 30, 715, 30);
		JLabel Perviy = new JLabel("Первый: Деменев Константин Евгеньевич, № зачётки 19130622. Дата работы №3: 22.04.2021.");
		Perviy.setBounds(30, 60, 715, 30);
		JLabel Vtoroy = new JLabel("Второй: Фаттахов Денис Валерикович, № зачётки 19130626");
		Vtoroy.setBounds(30, 90, 715, 30);
		JLabel Tretiy = new JLabel("Третий: Хуцану Данила Васильевич, № зачётки 19130645");
		Tretiy.setBounds(30, 120, 715, 30);
		JLabel fileImportLabel = new JLabel(importedText);
		fileImportLabel.setBounds(30, 150, 715, 30);

		// Кнопка возврата
		JButton button_back = new JButton("Назад");
		button_back.setBounds(270, 200, 100, 40);
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel.dispose(); // Закрытие окна информации
			}
		});

		sec_panel.add(button_back);
		sec_panel.add(moder);
		sec_panel.add(Perviy);
		sec_panel.add(Vtoroy);
		sec_panel.add(Tretiy);
		sec_panel.add(fileImportLabel);
		Panel.setVisible(true);

		Panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}