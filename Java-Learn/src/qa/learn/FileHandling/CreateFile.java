package qa.learn.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * Create a file in java using:
 * 1- File
 * 2- FileOutPutStream
 * 3- JAVA NIO Utils
 * 
 * @param args
 */

public class CreateFile {

	public static final String path = Paths.get("").toAbsolutePath() + "\\sample.txt";

	public static void main(String[] args) {
        
		// 1. Using File  :
		File file = new File(path);

		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("File Sample.txt is created");
			}
			else {
				System.out.println("File is already present...");
			}
				
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		//2. Using FileOutPutStream along with Scanner
		
		try {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name with location path : " );
		String fileName = scanner.nextLine();
		
		FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
		
		System.out.println("Enter the file content : ");
		String  content =  scanner.nextLine();
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();
		scanner.close();
		
		System.out.println("File is saved one the given location path ");
		}
		catch (Exception e) {
			System.out.println("Some exception is coming : ");
			 e.printStackTrace();
		}
		
		
		//3. Using Java NIO package
		Path pathLocation = Paths.get(Paths.get("").toAbsolutePath().toString(), "newFile.txt");
		
		try {
			Path newPath = Files.createFile(pathLocation);
			System.out.println("new File created at : " + newPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some exception is coming ....");
			e.printStackTrace();
		}
		
	 

	}

}
