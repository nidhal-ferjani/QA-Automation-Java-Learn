package qa.learn.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * This Example : Show How Read File Using FileReader
 * 
 * @autho Nidhal Ferjani : nidhal.ferjani@gmail.com
 *
 */

public class ReadFileUsingFileReader {
	public static final String path = System.getProperty("user.dir") + "\\nidhal.txt";

	public static void main(String[] args) {

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(new File(path));

			System.out.println("File content is : ");
			System.out.println("------------------");

			String content = "";
			int i = 0;

			while ((i = fileReader.read()) != -1) {
				content += (char) i;
			}

			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
