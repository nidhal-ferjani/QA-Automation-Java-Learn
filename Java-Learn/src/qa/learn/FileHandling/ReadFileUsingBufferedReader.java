package qa.learn.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This Example : Show How Read File Using BufferdeReader
 * 
 * @autho Nidhal Ferjani : nidhal.ferjani@gmail.com
 *
 */
public class ReadFileUsingBufferedReader {

	public static final String path = System.getProperty("user.dir") + "\\nidhal.txt";

	public static void main(String[] args) {

		  BufferedReader bufferedReader = null;
		try {
			
			bufferedReader = new BufferedReader(new FileReader(path));
			String line;
			
			System.out.println("File content is : ");
			System.out.println("------------------");
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}

		} catch (Exception e) {
            e.printStackTrace();
		}finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
