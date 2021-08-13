package qa.learn.FileHandling;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This Example : Show How Read File Using NIO Package
 * 
 * @autho Nidhal Ferjani : nidhal.ferjani@gmail.com
 *
 */

public class ReadFileUsingNIO {
	
	public static final String path = System.getProperty("user.dir") + "\\nidhal.txt";

	public static void main(String[] args) {
 
		System.out.println(Paths.get(path));
		try {
			List<String> content =
                                   Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
			
			
			
          
			Iterator<String> iterator = content.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			}
			
			System.out.println("----------------------------------------------");
          for (String string : content) {
			System.out.println(string);
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
