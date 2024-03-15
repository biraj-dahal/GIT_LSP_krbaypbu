package org.howard.edu.lsp.midterm.question2;
/**
 * Class representing a range of integers.
 */
public class IntegerRange implements Range{
	
	private  int lowerBound;
	private  int upperBound;
	
    /**
     * Constructs an IntegerRange with the given lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range (inclusive)
     * @param upperBound the upper bound of the range (inclusive)
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    
    /**
     * Checks if the range contains the specified value.
     *
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
	@Override
	public boolean contains(int value) {
		if(value >= lowerBound && value <= upperBound) {
			return true;
		}
		return false;
	}
	
    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */

	@Override
	public boolean overlaps(Range other) {
		// TODO Auto-generated method stub
		if(this.contains(other.getLowerBound()) || this.contains(other.getUpperBound())) {
			return true;
		}
		return false;
	}

    /**
     * Calculates the number of integers in the range.
     *
     * @return the size of the range
     */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return Math.abs(upperBound - lowerBound + 1);
	}

    /**
     * Gets the lower bound of the range.
     *
     * @return the lower bound of the range
     */
	@Override
	public int getLowerBound() {
		// TODO Auto-generated method stub
		return this.lowerBound;
	}

    /**
     * Gets the upper bound of the range.
     *
     * @return the upper bound of the range
     */
	@Override
	public int getUpperBound() {
		// TODO Auto-generated method stub
		return this.upperBound;
	}
	
	/**
     * Checks if two IntegerRange objects are equal.
     * Two ranges are equal if their lower and upper bounds are the same.
     *
     * @param o the object to compare
     * @return true if the objects are equal, otherwise false
     */
    @Override
    public boolean equals(Object o) {
    	if(!(o instanceof IntegerRange)) {
    		return false;
    	}
    	if(this==o) {
    		return true;
    	}
    	IntegerRange other = (IntegerRange) o;
    	return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }


}
