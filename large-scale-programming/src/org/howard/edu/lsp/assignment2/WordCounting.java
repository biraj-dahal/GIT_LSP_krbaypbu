package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounting {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "src/org/howard/edu/lsp/assignment2/words.txt";
		Scanner lineScanner = new Scanner(new File(fileName));
		
		System.out.println("The file we will be reading from is \"words.txt\" \n\nHere is the content:\n\n");
		
		while(lineScanner.hasNextLine()) {
			String line = lineScanner.nextLine();
			System.out.println(line);
		}
		
		LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<>();
		
		Scanner scanner = new Scanner(new File(fileName));
		
		System.out.println("\n\nHere is the frequency count of words for the paragraph above:\n\n");
		
		while(scanner.hasNext()) {
			String curWord = scanner.next().toLowerCase();
			if(!Character.isLetter(curWord.charAt(0)) || curWord.length() <= 3) {
				continue;
			}
            wordCountMap.put(curWord, wordCountMap.getOrDefault(curWord, 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
		        System.out.printf("%-15s %d%n", entry.getKey(), entry.getValue());
		    }
		
		scanner.close();
		}

	}