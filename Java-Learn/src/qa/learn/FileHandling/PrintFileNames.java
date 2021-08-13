package qa.learn.FileHandling;

import java.io.File;
import java.util.Arrays;

/*
 * Print all Files and Folders in a Directory in Sorted Order
 */

public class PrintFileNames {

	public static final String path = System.getProperty("user.dir");

	public static void main(String[] args) {

		File file = new File(path);

		File[] allFiles = file.listFiles();
		Arrays.sort(allFiles);

		for (File F : allFiles) {

			if (F.isFile()) {
				System.out.println("File Name : " + F.getName());
			}
			else if(F.isDirectory()) {
				System.out.println("Directory Name : " + F.getName());
			}
			else {
				System.out.println("Not Know : " + F.getName());
			}

		}

	}

}
