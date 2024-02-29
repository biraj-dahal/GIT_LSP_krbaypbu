package org.howard.edu.lsp.assignment4;
import  java.util.List;
import java.util.ArrayList;

public class IntegerSet  {
	// Store the set elements in an ArrayList
	private List<Integer> set;

	// Default Constructor
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set
	public void clear() {
		this.set.clear();
	}


// Returns the length of the set
	public int length() {
		return this.set.size();
	}; // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class.
*/
public boolean equals(Object o) {
	if(o instanceof IntegerSet){
		IntegerSet helper = (IntegerSet)o;
		return this.set.containsAll((helper.set)) && helper.set.containsAll(this.set);
	}
	return false;
}; 

// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {
	return this.set.contains(value);
};    


// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
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
 	public void add(int item) {
 		if(!this.set.contains(item)) {
 			this.set.add(item);
 		}
 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
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
public void union(IntegerSet intSetb) {
	for(int i = 0; i < intSetb.set.size(); i ++) {
		if(!this.set.contains(intSetb.set.get(i))){
			this.set.add(intSetb.set.get(i));
		}
	}
};

// Set intersection, all elements in s1 and s2
public void intersect(IntegerSet intSetb) {
	for(int i = this.set.size()-1; i >=0; i--) {
		if(!intSetb.contains(this.set.get(i))){ 
			this.set.remove(i);
		}
	}
}; 

// Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb) {
	for(int i = this.set.size()-1; i >=0; i--) {
		if(intSetb.set.contains(this.set.get(i))){ 
			this.set.remove(i);
		}
	}
}; // set difference, i.e. s1 - s2


// Set complement, all elements not in s1
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
boolean isEmpty() {
	return this.set.size() == 0 ;
}; 


// Return String representation of your set.  This overrides the equal method from 
// the Object class.

public String toString() {
	
	System.out.println(this.set.toString());
	return this.set.toString();
};	// return String representation of your set
}

