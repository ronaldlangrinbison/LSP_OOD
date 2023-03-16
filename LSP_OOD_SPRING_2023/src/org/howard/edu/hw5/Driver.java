package org.howard.edu.hw5;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
	        IntegerSet set1 = new IntegerSet();
	        IntegerSet set2 = new IntegerSet();
	        IntegerSet originalset1 = new IntegerSet();
	        IntegerSet originalset2 = new IntegerSet();

	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);
	        set1.add(5);

	        set2.add(4);
	        set2.add(5);
	        set2.add(6);
	        set2.add(7);
	        set2.add(8);
	        set2.add(9);
	        
	        originalset1.union(set1);
	        originalset2.union(set2);
	        
	        System.out.println("");
	        System.out.println("===============================================================================");
	        System.out.println("The original values of set1 and set2 are not maintained throughout this process");
	        System.out.println("===============================================================================");
	        System.out.println("");

	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Set 1 length: " + set1.length());
	        System.out.println("Set 2 length: " + set2.length());
	        System.out.println("Set 1 contains 3: " + set1.contains(3));
	        System.out.println("Set 2 contains 3: " + set2.contains(3));
	        System.out.println("Set 1 largest: " + set1.largest());
	        System.out.println("Set 2 largest: " + set2.largest());
	        System.out.println("Set 1 smallest: " + set1.smallest());
	        System.out.println("Set 2 smallest: " + set2.smallest());

	        set1.add(6);
	        System.out.println("After adding 6 to set 1: " + set1);
	        
	        set2.remove(8);
	        System.out.println("After removing 8 from set 2: " + set2);

	        set1.union(set2);
	        System.out.println("Set 1 union set 2: " + set1);

	        
	        System.out.println("Set 1 after union: " + set1);
	        System.out.println("Set 2 after union: " + set2);
	        
	        set1.intersect(set2);
	        System.out.println("Set 1 intersect set 2: " + set1);
	        
	        System.out.println("Set 1 after intersection: " + set1);
	        System.out.println("Set 2 after intersection: " + set2);

	        set1.diff(set2);
	        System.out.println("Set 1 diff set 2: " + set1);

	        set1.clear();
	        System.out.println("After clearing set 1: " + set1);
	        
	        System.out.println("");
	        System.out.println("==========================================================================");
	        System.out.println("Lets maintain the original values of set1 and set2 throughout this process");
	        System.out.println("========================================================================= ");
	        System.out.println("");
	        
	        set1.clear();
	        set2.clear();
	        set1.union(originalset1);
	        set2.union(originalset2);
	        
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Set 1 length: " + set1.length());
	        System.out.println("Set 2 length: " + set2.length());
	        System.out.println("Set 1 contains 3: " + set1.contains(3));
	        System.out.println("Set 2 contains 3: " + set2.contains(3));
	        System.out.println("Set 1 largest: " + set1.largest());
	        System.out.println("Set 2 largest: " + set2.largest());
	        System.out.println("Set 1 smallest: " + set1.smallest());
	        System.out.println("Set 2 smallest: " + set2.smallest());

	        set1.add(6);
	        System.out.println("After adding 6 to set 1: " + set1);

	        set2.remove(8);
	        System.out.println("After removing 8 from set 2: " + set2);

	        set1.union(set2);
	        System.out.println("Set 1 union set 2: " + set1);

	        
	        System.out.println("Set 1 after union: " + set1);
	        System.out.println("Set 2 after union: " + set2);
	        
	        set1.clear();
	        set2.clear();
	        set1.union(originalset1);
	        set2.union(originalset2);
	        
	        set1.intersect(set2);
	        System.out.println("Set 1 intersect set 2 based on original values: " + set1);
	        
	        System.out.println("Set 1 after intersection: " + set1);
	        System.out.println("Set 2 after intersection: " + set2);

	        set1.clear();
	        set2.clear();
	        set1.union(originalset1);
	        set2.union(originalset2);

	        set1.diff(set2);
	        System.out.println("Set 1 diff set 2 based on original values: " + set1);

	        set1.clear();
	        System.out.println("After clearing set 1: " + set1);
	    }

}
