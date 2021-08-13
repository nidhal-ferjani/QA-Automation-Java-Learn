package qa.learn.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInptStream {

	public static final String path = System.getProperty("user.dir") + "\\nidhal.txt";

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;

		try {

			fileInputStream = new FileInputStream(new File(path));
			System.out.println("File content is  : ");

			int i = 0;
			String content = "";
			while ((i = fileInputStream.read()) != -1) {

				content += (char) i;
			}
			System.out.println(content);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (fileInputStream != null) {

					fileInputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
