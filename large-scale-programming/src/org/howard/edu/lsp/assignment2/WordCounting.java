package org.howard.edu.lsp.assignment2; //package structure we will be using

import java.util.Scanner; // Class Scanner to read through the text in a file.
import java.io.FileNotFoundException; // to throw exception if input file is not seen
import java.io.IOException; // to throw exception if input file is not seen
import java.util.LinkedHashMap; // Using Linked HashMap to keep the order of words seen in tact
import java.util.Map; // since LinkedHashMap doesn't have an iterator of itself, we will use Map's iterator
import java.nio.file.Path; // to built a Path for the file.
import java.nio.file.Paths; // to built path for the File.
import java.net.URL; // to get the path of the user.

public class WordCounting { // Class WordCounting where we define the workflow

	public static void main(String[] args) throws FileNotFoundException { // entry point of the program 
		
		URL url = WordCounting.class.getResource("words.txt");
        String filePath = url.getPath(); 
        
        Path fileName = Paths.get(filePath); // add the current working directory to the relative path, and make make absolute path for that host computer
        
		Scanner lineScanner = null; // Scanner object defined to read, and print 
		try {
			lineScanner = new Scanner(fileName); // try to dynamically assign Scanner object ptr to start of file
		} catch (IOException e) {
			e.printStackTrace(); // in case the file doesnt exist, or error opening, return exception
		}
		
		System.out.println("The file we will be reading from is \"words.txt\" \n\nHere is the content:\n\n"); // formatting of the text
		
		while(lineScanner.hasNextLine()) { // go through each line
			String line = lineScanner.nextLine(); // get the line, and lineScanner goes to next line
			System.out.println(line); // print the current line
		}
		lineScanner.close(); // close the lineScanner object
		
		LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<>(); // using linkeddHashMap class to define object to maintain order
		
		Scanner scanner = null; // Scanner object defined to read, and put to LinkedHashMap
		try {
			scanner = new Scanner(fileName); // try to dynamically assign Scanner object ptr to start of file
		} catch (IOException e) {
			e.printStackTrace(); // in case the file doesnt exist, or error opening, return exception
		}
		
		System.out.println("\n\nHere is the frequency count of words for the paragraph above:\n\n"); // formatting
		
		while(scanner.hasNext()) { //scanner delimited by whitespace and newline by default
			String curWord = scanner.next().toLowerCase(); // convert the current word to lowercase
			if(!Character.isLetter(curWord.charAt(0)) || curWord.length() <= 3) { //if the word starts with non-letter word, or if the curWord Length is less than 3, we continue the loop
				continue;
			}
			if (curWord.contains("'")) { // if there is a contraction
                String[] contractions = curWord.split("'"); // spilt the word into two parts
                if(contractions[0].length() >3) {  // check if the separated part is of length > 3
                wordCountMap.put(contractions[0], wordCountMap.getOrDefault(contractions[0], 0) + 1); //put the curWord to the Map as key, and put the value as 0 if it already doesnt exist else keep existing +1
                }
                if(contractions[1].length() >3) {// check if the separated part is of length > 3
                wordCountMap.put(contractions[1], wordCountMap.getOrDefault(contractions[1], 0) + 1); //put the curWord to the Map as key, and put the value as 0 if it already doesnt exist else keep existing +1
                }
            } else {
                wordCountMap.put(curWord, wordCountMap.getOrDefault(curWord, 0) + 1); //put the curWord to the Map as key, and put the value as 0 if it already doesnt exist else keep existing +1
   
		}
		}
		
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) { // Map iterator to fetch the key, value pair
		        System.out.printf("%-15s %d%n", entry.getKey(), entry.getValue()); //set width and print the key, pair value.
		    }
		
		scanner.close(); //close the scanner object for the file.
		}

	}