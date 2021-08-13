package qa.learn.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Exercice interview Question Java - Selenium
 * 
 * Get the maximum word count in a text file || The most repeated word in a file
 * 
 * @author Nidhal Ferjani
 *
 */
public class MaxWordCount {

	public static final String path = System.getProperty("user.dir") + "\\demo.txt";

	// public static final String path1 = Paths.get("").toAbsolutePath() +
	// "\\demo.txt";
	public static void main(String[] args) {

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(path));

			String currentLine = reader.readLine();

			while (currentLine != null) {
				String[] words = currentLine.toLowerCase().split(" ");
				for (String string : words) {

					if (wordMap.containsKey(string)) {
						wordMap.put(string, wordMap.get(string)+1);
					}else {
						wordMap.put(string, 1);
					}

				}

				currentLine = reader.readLine();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Map<String, Integer> maxMap = new HashMap<>();
		wordMap.forEach((key,value) -> System.out.println(key + " : " + value));
		
		wordMap.
		       entrySet().
		             stream().
		                  filter(entry -> entry.getValue() == Collections.max(wordMap.values())).
		                                           forEach(entry -> maxMap.put(entry.getKey(), entry.getValue()));
		System.out.println(maxMap );
	}

}
