package com.examples.regularexpression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctWordCount {

	public static void main(String[] args) {

		Map<String , Integer> mapOfWordsAndItsCount = null;
		String fileName1 = DistinctWordCount.class.getResource("wordParagraph.txt").getPath() ;
		
		//Resource resource = new ClassPathResource("com/example/Foo.class");
		System.out.println(fileName1);
		
		try {
			mapOfWordsAndItsCount = getDistinctWordCounts(fileName1);
			System.out.println(mapOfWordsAndItsCount);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 *  user has to pass file Name as <code> String </code> 
	 * @param fileName
	 * @return Map<String , Integer>
	 * @throws FileNotFoundException
	 */
	public static Map<String , Integer> getDistinctWordCounts(String fileName)
			throws FileNotFoundException {

		Scanner scanner = new Scanner(new File(fileName));
		int countWord = 0;
		// List<String> listString = Arrays.asList(words);
		Map<String, Integer> mapOfDistinctWords = new HashMap<String, Integer>();
		while (scanner.hasNext()) {

			String word = scanner.next();
			if (!mapOfDistinctWords.containsKey(word)) {
				mapOfDistinctWords.put(word, 1);
			} else {
				countWord = mapOfDistinctWords.get(word) + 1;
				mapOfDistinctWords.remove(word);
				mapOfDistinctWords.put(word, countWord);
			}
		}
		scanner.close();
		return mapOfDistinctWords;
		
	}

}
