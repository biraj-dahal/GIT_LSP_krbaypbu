package org.howard.edu.lsp.midterm.question1;

/**
 * SecurityOps class uses encryption technique by making even string characters, and odd string characters and add it.
 */
public class SecurityOps {
	/**
	 * 
	 * @param text - which has the original text to be encrypted
	 * @return - encrypted string which undergoes above mentioned encryption technique.
	 */
    public static String encrypt(String text) {
    	// string builders to hold two parts
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
        
        text = text.replace(" ", ""); // get rid of space since it wont account to indexes

        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
                if (i % 2 == 0) { // if even index char
                    evenChars.append(c);
                } else { // if odd index char
                    oddChars.append(c);
                }
            }
        
        // return the concat of even index chars, and odd index chars
        return evenChars.toString() + oddChars.toString();
    }
    

}
