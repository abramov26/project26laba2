package laba5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextFileUpload {

	public static void FileUpload() {
		String textToPut = "";
		JFileChooser fileopen = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Текстовые файлы", "txt", "text");
		fileopen.setFileFilter(filter);
		int ret = fileopen.showDialog(null, "Открыть файл");
		if (ret == JFileChooser.APPROVE_OPTION) {
			File file = fileopen.getSelectedFile();
			System.out.println("Selected file is: " + file.getAbsolutePath());

			try (FileReader reader = new FileReader(file.getAbsolutePath())) {
				char[] buf = new char[256];
				int c;
				while ((c = reader.read(buf)) > 0) {

					if (c < 256) {
						buf = Arrays.copyOf(buf, c);
					}
					textToPut = String.valueOf(buf);
				}
			} catch (IOException ex) {

			}

		}
		laba5.Info.importedText = textToPut;
	}
}