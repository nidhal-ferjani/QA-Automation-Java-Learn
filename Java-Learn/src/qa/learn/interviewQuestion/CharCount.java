package qa.learn.interviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Java Interview Question: How To Count Occurrences Of Each Character In String
 * In Java and ignore space character
 * 
 * @autho Nidhal Ferjani : nidhal.ferjani@gmail.com
 *
 */

public class CharCount {

	public static void getCharCount(String str) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			//if (!Character.isWhitespace(c)) {
				if (charMap.containsKey(Character.toLowerCase(c))) {

					charMap.put(Character.toLowerCase(c), charMap.get(Character.toLowerCase(c)) + 1);
				} else {
					charMap.put(Character.toLowerCase(c), 1);
				}
		//	}
		}

		System.out.println(str + " ===> " + charMap);
	}
	
	/*******************************************************************************************************/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Any Word : ");
		String dataEntry = scanner.nextLine();

		getCharCount(dataEntry);

		scanner.close();

	}

}
