package laba5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info implements ActionListener {

	public static String importedText = "�� ������ ��������� ��������� ���� � ��� ���������� �������� �����";

	public void actionPerformed(ActionEvent e) {
		JFrame Panel = new JFrame(); // �������� ������������ ����
		Panel.setTitle("����������");
		Panel.setBounds(1000, 300, 765, 300);
		Panel.setResizable(false); // ������������� ������ ����

		JPanel sec_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		sec_panel.setLayout(null); // ��������������� �������� ����������
		Panel.add(sec_panel);

		// ����������� ����� ������
		JLabel moder = new JLabel("���������: ������� ��������� ������������, � ������� 19130172. ���� ������ �3: 22.04.2021.");
		moder.setBounds(30, 30, 715, 30);
		JLabel Perviy = new JLabel("������: ������� ���������� ����������, � ������� 19130622. ���� ������ �3: 22.04.2021.");
		Perviy.setBounds(30, 60, 715, 30);
		JLabel Vtoroy = new JLabel("������: �������� ����� �����������, � ������� 19130626");
		Vtoroy.setBounds(30, 90, 715, 30);
		JLabel Tretiy = new JLabel("������: ������ ������ ����������, � ������� 19130645");
		Tretiy.setBounds(30, 120, 715, 30);
		JLabel fileImportLabel = new JLabel(importedText);
		fileImportLabel.setBounds(30, 150, 715, 30);

		// ������ ��������
		JButton button_back = new JButton("�����");
		button_back.setBounds(270, 200, 100, 40);
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel.dispose(); // �������� ���� ����������
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