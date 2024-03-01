package org.howard.edu.lsp.assignment4;
import  java.util.List;
import java.util.ArrayList;
/**
 * The IntegerSet class represents a set of integers and provides various operations on sets such as union, intersection, difference, etc.
 * The set elements are stored internally in an ArrayList.
 */
public class IntegerSet  {
	// Store the set elements in an ArrayList
	private List<Integer> set;

	// Default Constructor

    /**
     * Default Constructor for IntegerSet.
     * Initializes an empty set.
     */
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
	// Constructor if you want to pass in already initialized
    /**
     * Constructor for IntegerSet.
     * Initializes the set with the provided ArrayList of integers.
     * @param set An ArrayList of integers to initialize the set.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set
    /**
     * Clears the internal representation of the set.
     */
	public void clear() {
		this.set.clear();
	}


// Returns the length of the set
	 /**
     * Returns the number of elements in the set.
     * @return The number of elements in the set.
     */
	public int length() {
		return this.set.size();
	}; // returns the length

    /**
     * Checks if two sets are equal.
     * Two sets are considered equal if they contain all the same values in any order.
     * Overrides the equals method from the Object class.
     * @param o The object to compare.
     * @return True if the sets are equal, false otherwise.
     */
	
@Override
public boolean equals(Object o) {
	if(o instanceof IntegerSet){
		IntegerSet helper = (IntegerSet)o;
		return this.set.containsAll((helper.set)) && helper.set.containsAll(this.set);
	}
	return false;
}; 

// Returns true if the set contains the value, otherwise false
/**
 * Checks if the set contains a specific value.
 * @param value The value to check for.
 * @return True if the set contains the value, false otherwise.
 */
public boolean contains(int value) {
	return this.set.contains(value);
};    


// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
/**
 * Finds the largest item in the set.
 * @return The largest item in the set.
 * @throws IntegerSetException If the set is empty.
 */
public int largest() throws IntegerSetException{
	if(this.set.isEmpty()){
		throw new IntegerSetException("The set you are trying to find largest is empty");
	}
	int maxVal = Integer.MIN_VALUE;
	for(int i =0; i < this.set.size(); ++i) {
		if(this.set.get(i) >= maxVal) {
			maxVal = this.set.get(i);
		}
	}

	return maxVal ;

//	String e = "Empty";
//	throw new IntegerSetException(e);
	
}; 

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
/**
 * Finds the smallest item in the set.
 * @return The smallest item in the set.
 * @throws IntegerSetException If the set is empty.
 */
public int smallest() throws IntegerSetException {
	if(this.set.isEmpty()){
		throw new IntegerSetException("The set you are trying to find smallest is empty");
	}
	int minVal = Integer.MAX_VALUE;
	for(int i =0; i < this.set.size(); ++i) {
		if(this.set.get(i) <= minVal) {
			minVal = this.set.get(i);
		}
	}
	return minVal ;

	
	
//	String e = "Empty";
	
//	throw new IntegerSetException(e);
};

	// Adds an item to the set or does nothing it already there	
/**
 * Adds an item to the set if it is not already present.
 * @param item The item to be added to the set.
 */
 	public void add(int item) {
 		if(!this.set.contains(item)) {
 			this.set.add(item);
 		}
 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
    /**
     * Removes an item from the set if it is present.
     * @param item The item to be removed from the set.
     */
public void remove(int item) {
	if(this.set.contains(item)) {
		for(int j = 0; j < this.set.size(); j++) {
			if(this.set.get(j) == item) {
				this.set.remove(j);
				break;
			}
		}
	}
}; 


// Set union
/**
 * Performs the union of two sets.
 * Adds all elements from the provided set to this set.
 * @param intSetb The set to perform union with.
 */
public void union(IntegerSet intSetb) {
	for(int i = 0; i < intSetb.set.size(); i ++) {
		if(!this.set.contains(intSetb.set.get(i))){
			this.set.add(intSetb.set.get(i));
		}
	}
};

// Set intersection, all elements in s1 and s2
/**
 * Performs the intersection of two sets.
 * Removes elements from this set that are not present in the provided set.
 * @param intSetb The set to perform intersection with.
 */
public void intersect(IntegerSet intSetb) {
	for(int i = this.set.size()-1; i >=0; i--) {
		if(!intSetb.contains(this.set.get(i))){ 
			this.set.remove(i);
		}
	}
}; 

// Set difference, i.e., s1 –s2
/**
 * Finds the difference between two sets.
 * Removes elements from this set that are present in the provided set.
 * @param intSetb The set to perform difference with.
 */
public void diff(IntegerSet intSetb) {
	for(int i = this.set.size()-1; i >=0; i--) {
		if(intSetb.set.contains(this.set.get(i))){ 
			this.set.remove(i);
		}
	}
}; // set difference, i.e. s1 - s2


// Set complement, all elements not in s1
/**
 * Finds the complement of this set.
 * Removes all elements from this set that are present in the provided set.
 * @param intSetb The set to find the complement with.
 */
public void complement(IntegerSet intSetb) {
	for(int i = intSetb.set.size()-1; i >=0; i--) {
		if(this.set.contains(intSetb.set.get(i))){ 
			intSetb.set.remove(i);
		}
	}
	this.set.clear();
	this.set.addAll(intSetb.set);
}

// Returns true if the set is empty, false otherwise
/**
 * Checks if the set is empty.
 * @return True if the set is empty, false otherwise.
 */
boolean isEmpty() {
	return this.set.size() == 0 ;
}; 


// Return String representation of your set.  This overrides the equal method from 
// the Object class.
/**
 * Returns the string representation of the set.
 * @return The string representation of the set.
 */
@Override
public String toString() {
	
	System.out.println(this.set.toString());
	return this.set.toString();
};	// return String representation of your set
}

