package laba5; //����� Java �������

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class Subversion {

	
	JFrame main_GUI = new JFrame("subversion"); // �������� ������������ ����
	public int[] myArray; //���� ����� ������������ ������, ��������������� � ������� RandomArray

	public Subversion() {

		main_GUI.setTitle("Using git for developers"); //�������� ��������� ������������ ����
		main_GUI.setBounds(500, 400, 550, 575);
		main_GUI.setResizable(false); // ������������� ������ ����

		JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		main_panel.setLayout(null);
		main_GUI.add(main_panel);

		JLabel spec_info = new JLabel("���������� �����������"); // ����������� ������ ��� �����������
		spec_info.setBounds(180, 0, 200, 30);
		main_panel.add(spec_info);

		JLabel laba_info = new JLabel("������������ ������ �3"); // ����������� ������ ��� �����������
		laba_info.setBounds(180, 20, 200, 30);
		main_panel.add(laba_info);

		JButton button_exit = new JButton("�����"); // ��������� ������
		button_exit.setBounds(375, 450, 150, 40);
		ActionListener actionListener = new ListenerButton(); // ������� ���������
		button_exit.addActionListener(actionListener); // ��������� ��������� � ������
		main_panel.add(button_exit);

		// �����

		JButton button_info = new JButton("����������"); // ��������� ������
		button_info.setBounds(12, 450, 150, 40);
		ActionListener Listener = new Info(); // ������� ���������
		button_info.addActionListener(Listener); // ��������� ��������� � ������
		main_panel.add(button_info);

		// �����

		JLabel resultArray = new JLabel("��������������� ������:"); // ����������� ������ ��� �����������
		resultArray.setBounds(200, 330, 400, 30);
		main_panel.add(resultArray);

		JButton button_array = new JButton("��������� �������"); // ��������� ������
		button_array.setBounds(12, 325, 175, 40);

		main_panel.add(button_array);

		ImagePanel imgLabel = new ImagePanel();
		imgLabel.setBounds(225, 60, 100, 50);
		imgLabel.setVisible(false);
		main_panel.add(imgLabel);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("�������");

		JMenuItem menuItem1 = new JMenuItem("��������� ���� � ������ 26");

		ActionListener uploadListener = new ActionListener() { // �������� ���������
			public void actionPerformed(ActionEvent e) {
				laba5.TextFileUpload.FileUpload();

			}
		};
		// ActionListener uploadListener = new InfoWithUpload(); // ������� ���������
		menuItem1.addActionListener(uploadListener); // ��������� ��������� � ������
		fileMenu.add(menuItem1);

		JMenuItem logoItem = new JMenuItem("���������� ������� �����");
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

		JTextField radiusField = new JTextField("������ ����");
		radiusField.setBounds(169, 150, 100, 20);
		main_panel.add(radiusField);

		JTextField heightField = new JTextField("������");
		heightField.setBounds(269, 150, 100, 20);
		main_panel.add(heightField);

		JLabel resultInfo = new JLabel("�������� (���. �.):"); // ����������� ������ ��� �����������
		resultInfo.setBounds(170, 220, 200, 30);
		main_panel.add(resultInfo);

		JButton button_calculation = new JButton("����������"); // ��������� ������
		button_calculation.setBounds(170, 185, 200, 30);
		button_calculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String radiusFieldinString = radiusField.getText();
				String heightFieldinString = heightField.getText();
				double radiusFieldInInt = Double.parseDouble(radiusFieldinString);
				double heightFieldInInt = Double.parseDouble(heightFieldinString);

				double resultInDouble = 2 * Math.PI * radiusFieldInInt * heightFieldInInt / 3;
				String resultInString = String.format("%.2f",resultInDouble); //����� ���������� � ��������� ������ � ���������� �� 2-� ������

				resultInfo.setText("�������� (���. �.): " + resultInString);

			}
		});

		main_panel.add(button_calculation);

		JMenuItem exitItem = new JMenuItem("�����");

		// ������

		JLabel resultSortArray = new JLabel("��������������� ������:"); // ����������� ������ ��� �����������
		resultSortArray.setBounds(200, 375, 400, 30);
		main_panel.add(resultSortArray);

		JButton button_sort = new JButton("����������"); // ��������� ������
		button_sort.setBounds(12, 370, 175, 40);
		button_sort.setEnabled(false);
		main_panel.add(button_sort);

		button_sort.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Bubblesort mySort = new Bubblesort();
				int[] mySortedArray = mySort.sort(myArray);
				int a = mySortedArray.length;
				String arrayInString = "������: ";
				for (int i = 0; i < a; i++) {
					int resultInInt = mySortedArray[i];

					arrayInString += String.valueOf(resultInInt) + " ";

				}
				resultSortArray.setText(arrayInString);

			}

		});

		// �����

		button_array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myArray = RandomArray.generateArray();
				int a = myArray.length;
				String arrayInString = "������: ";
				for (int i = 0; i < a; i++) {
					int resultInInt = myArray[i];

					arrayInString += String.valueOf(resultInInt) + " ";

				}
				resultArray.setText(arrayInString);
				button_sort.setEnabled(true);
			}
		});

		
		String[] options = { "����������� ������� ����� � ������� ������ ����", "����������� ������� ����� � ��������",
				"����������� ������� ����� � ������� ����� ����"}; // ������ �������� ������

		JComboBox<String> cb = new JComboBox<String>(options); // ���������� ������� ����������
		ActionListener comboBoxListener = new ActionListener() { // �������� ���������
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cb.getSelectedItem();
				switch (selectedItem) {
				case "����������� ������� ����� � ������� ������ ����":
					imgLabel.setLocation(400, 60);
					break;
				case "����������� ������� ����� � ��������":
					imgLabel.setLocation(225, 60);
					break;
				case "����������� ������� ����� � ������� ����� ����":
					imgLabel.setLocation(50, 60);
					break;
				}
			}
		};

		cb.addActionListener(comboBoxListener); // ���������� ��������� � ����������
		cb.setBounds(75, 250, 400, 30); // ����������� �������� ���� combobox
		main_panel.add(cb); // ���������� combobox �� ������
		fileMenu.add(exitItem);
		exitItem.addActionListener(actionListener);

		// main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java

	}

	public void setVisible() {
		main_GUI.setVisible(true); //������ ���� �������
	}

	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		Subversion student = new Subversion();
		student.setVisible();

	}
}