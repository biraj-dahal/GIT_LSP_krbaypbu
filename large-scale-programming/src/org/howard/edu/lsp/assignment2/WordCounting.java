package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCounting {

	public static void main(String[] args) throws FileNotFoundException {
		
		String wordsPath = File.separator + "large-scale-programming" + File.separator + "src" + File.separator + "org" + File.separator + "howard" + File.separator + "edu" + File.separator + "lsp" + File.separator + "assignment2" + File.separator + "words.txt";

        String curDir = System.getProperty("user.dir");
        Path fileName = Paths.get(curDir, wordsPath);
        
		Scanner lineScanner = null;
		try {
			lineScanner = new Scanner(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The file we will be reading from is \"words.txt\" \n\nHere is the content:\n\n");
		
		while(lineScanner.hasNextLine()) {
			String line = lineScanner.nextLine();
			System.out.println(line);
		}
		lineScanner.close();
		
		LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<>();
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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