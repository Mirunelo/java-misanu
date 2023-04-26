package praksaNEW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHelper {

	public static ArrayList<String> loadFiles(String fileName) {
		ArrayList<String> fileContent = new ArrayList<String>();
		File file = new File(fileName);
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				if (!aLine.isBlank())
					fileContent.add(aLine);
			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileContent;
	}
}
