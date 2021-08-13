package qa.learn.FileHandling;

import java.io.File;
import java.util.Scanner;

/**
 * This Example : show how Read file Using Scanner
 * 
 * @autho Nidhal Ferjani : nidhal.ferjani@gmail.com
 *
 */
public class ReadFileUsingScanner {

	public static final String path = System.getProperty("user.dir") + "\\nidhal.txt";

	public static void main(String[] args) {
		
		Scanner scanner = null;

		try {

			File file = new File(path);
			scanner = new Scanner(file);
			
			System.out.println("File content is : ");
			System.out.println("------------------");
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(scanner != null) {
				scanner.close();
			}
		}

	}

}
