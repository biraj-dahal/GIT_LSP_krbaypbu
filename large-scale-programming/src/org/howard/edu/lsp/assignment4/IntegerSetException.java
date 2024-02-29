package org.howard.edu.lsp.assignment4;

/**
 * The IntegerSetException class represents an exception specific to the IntegerSet class.
 * It is thrown when an error occurs during operations on IntegerSet objects.
 */
public class IntegerSetException extends Exception{
    /**
     * Constructs a new IntegerSetException with the specified detail message.
     * @param error The detail message of the exception.
     */
	public IntegerSetException(String erro){
		super(erro);
	}
}

