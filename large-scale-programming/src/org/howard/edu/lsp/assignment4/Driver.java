package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;

/**
 * The Driver class contains the main method to test the functionality of the IntegerSet class.
 * It performs various tests on the IntegerSet class methods and prints the results.
 */
public class Driver {

    /**
     * The main method to test the functionality of the IntegerSet class.
     * @param args The command line arguments (not used).
     * @throws IntegerSetException If an error occurs during the test.
     */

	public static void main(String[] args) throws IntegerSetException {
		
		    System.out.println("\nTest 1: 'To string, and add'\n");
	        IntegerSet set1 = new IntegerSet();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        System.out.println("Set 1: " + set1.toString()); // Expected: 123
	        
	        
		    System.out.println("\nTest 2: 'Test constructor with initialized ArrayList'\n");
	        // Test constructor with initialized ArrayList
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        IntegerSet set2 = new IntegerSet(list);
	        System.out.println("Set 2: " + set2.toString()); // Expected: 345

	        
	        // Test clear method
		    System.out.println("\nTest 3: 'Test clear method'\n");
	        set1.clear();
	        System.out.println("Set 1 after clear: " + set1.toString()); // Expected: Empty

	        
	        // Test length method
		    System.out.println("\nTest 4: 'Test length method'\n");
	        System.out.println("Length of Set 2: " + set2.length()); // Expected: 3

	        
	        // Test equals method
		    System.out.println("\nTest 5: 'Test equals method'\n");
	        System.out.println("Set 1 equals Set 2: " + set1.equals(set2)); // Expected: false

	        
	        // Test contains method
		    System.out.println("\nTest 6: 'Test contains method'\n");
	        System.out.println("Set 2 contains 4: " + set2.contains(4)); // Expected: true

	        // Test largest method 
		    System.out.println("\nTest 7: 'Test largest method '\n");
	        System.out.println("Largest element in Set 2: " + set2.largest()); // Expected: 5


	        // Test smallest method
		    System.out.println("\nTest 8: 'Test smallest method'\n");
	        System.out.println("Smallest element in Set 2: " + set2.smallest()); // Expected: 3


	        // Test remove method
		    System.out.println("\nTest 9: 'Test remove method'\n");
	        set2.remove(4);
	        System.out.println("Set 2 after removing 4: " + set2.toString()); // Expected: 35

	        // Test union method
		    System.out.println("\nTest 10: 'Test union method'\n");
	        IntegerSet set3 = new IntegerSet();
	        set3.add(2);
	        set3.add(4);
	        set3.add(6);
	        set2.union(set3);
	        System.out.println("Union of Set 2 and Set 3: " + set2.toString()); // Expected: 23546

	        // Test intersect method
		    System.out.println("\nTest 11: 'Test intersect method'\n");
	        set2.intersect(set3);
	        System.out.println("Intersection of Set 2 and Set 3: " + set2.toString()); // Expected: 26

	        // Test diff method
		    System.out.println("\nTest 12: 'Test diff method'\n");
	        set2.diff(set3);
	        System.out.println("Difference of Set 2 and Set 3: " + set2.toString()); // Expected: 5

	        // Test complement method
		    System.out.println("\nTest 13: 'Test complement method'\n");
	        set2.complement(set3);
	        System.out.println("Complement of Set 2 using Set 3: " + set2.toString()); // Expected: 26
	        
	        //Exception throw
		    System.out.println("\nTest 14: 'Test Exception throw'\n");
	        IntegerSet set4 = new IntegerSet();
	        System.out.println("Smallest element in Set 4: " + set4.smallest()); // Expected: throws exception
	        

	}

}
