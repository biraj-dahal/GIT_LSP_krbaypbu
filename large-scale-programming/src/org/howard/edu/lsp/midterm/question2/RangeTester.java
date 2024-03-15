package org.howard.edu.lsp.midterm.question2;

/**
 * Class to test the IntegerRange implementation.
 */
public class RangeTester {
    public static void main(String[] args) {

        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(16, 19);
        

        System.out.println("Does range1 contain 5? " + range1.contains(5)); 
        System.out.println("Does range1 contain 15? " + range1.contains(15)); 
        

        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); 
        System.out.println("Do range2 and range3 overlap? " + range2.overlaps(range3)); 
        

        System.out.println("Size of range1: " + range1.size()); 
        System.out.println("Size of range3: " + range3.size()); 
        

        IntegerRange range4 = new IntegerRange(1, 10);
        System.out.println("Are range1 and range4 equal? " + range1.equals(range4)); 
        System.out.println("Are range1 and range2 equal? " + range1.equals(range2)); 

    }
}
