package org.howard.edu.lsp.midterm.question1;


/**
 * Driver class is the class to check the results of encryption using SecurityOps. 
 */
public class Driver {
	/**
	 * The main method initializes a text, and encrypts the text to compare the original, and text after encryption.
	 * @param args 
	 */
	    public static void main(String[] args) {
	        String ini = "I love CSCI363"; 
	        
	        // call encrypt method of SecurityOps class, and get hold of encrypted text
	        String afterEncry = SecurityOps.encrypt(ini); 
	        
	        // check for the difference 
	        System.out.println("Initial text: " + ini);
	        System.out.println("After Encryption text: " + afterEncry);
	    
	    }
	}

