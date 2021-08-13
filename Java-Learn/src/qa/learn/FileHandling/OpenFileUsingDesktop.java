package qa.learn.FileHandling;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.Paths;

/**
 * File Handling in Java : Read A File (FileReader, Buffered Reader,
 * FileInputStream)
 * 
 * @author Nidhal Ferjani
 *
 */
public class OpenFileUsingDesktop {

	public static final String path = Paths.get("").toAbsolutePath() + "\\nidhal.txt";

	public static void main(String[] args) {

		File file = new File(path);

		try {

			if (!Desktop.isDesktopSupported()) {
				System.out.println("Desktop is not supported");
				return;
			}

			Desktop desktop = Desktop.getDesktop();
			if (file.exists()) {
				desktop.open(file); // open the file in GUI
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
