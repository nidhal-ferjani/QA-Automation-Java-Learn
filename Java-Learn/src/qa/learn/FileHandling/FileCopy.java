package qa.learn.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

/*
 * File Handling 1- :
 * Copy a file (pdf) and create a different file in the same location
 * @param : args
 */
public class FileCopy {

	public static final String path = Paths.get("").toAbsolutePath() + "\\sample.pdf";

	public static void main(String[] args) {

		copyFile();
	}

	/*************************************************************************************************/

	public static void copyFile() {
		File file = new File(path);
		File fileCopy = new File(System.getProperty("user.dir") + "\\sample-copy.pdf");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(fileCopy);
			System.out.println(fileInputStream.available());
			int i = 0;

			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}

		} catch (Throwable e) {

			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}

				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
