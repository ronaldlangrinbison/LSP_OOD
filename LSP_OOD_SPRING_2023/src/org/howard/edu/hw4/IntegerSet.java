package org.howard.edu.hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {

    private List<Integer> set;

    // Default constructor
    public IntegerSet() {
        set = new ArrayList<Integer>();
    }

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
    public boolean equals(IntegerSet b) {
        List<Integer> bSet = b.getSet();
        if (set.size() != bSet.size()) {
            return false;
        }
        List<Integer> temp = new ArrayList<Integer>(set);
        temp.removeAll(bSet);
        return temp.isEmpty();
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    
    // Returns the largest item in the set; Throws a IntegerSetException if the set is empty
    public int largest() {
        if (set.isEmpty()) {
            throw new RuntimeException("The set is empty.");
        }
        return Collections.max(set);
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    public int smallest() {
        if (set.isEmpty()) {
            throw new RuntimeException("The set is empty.");
        }
        return Collections.min(set);
    }

    // Adds an item to the set or does nothing it already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove((Integer) item);
    }

    // Set union
    public void union(IntegerSet intSetb) {
        List<Integer> bSet = intSetb.getSet();
        for (Integer i : bSet) {
            add(i);
        }
    }

 // Set intersection
    public void intersect(IntegerSet intSetb) {
        List<Integer> bSet = intSetb.getSet();
        List<Integer> result = new ArrayList<Integer>();
        for (Integer i : set) {
            if (bSet.contains(i)) {
                result.add(i);
            }
        }
        set = result;
    }

    // Set difference, i.e., s1 - s2
    public void diff(IntegerSet intSetb) {
        List<Integer> bSet = intSetb.getSet();
        List<Integer> result = new ArrayList<Integer>();
        for (Integer i : set) {
            if (!bSet.contains(i)) {
                result.add(i);
            }
        }
        set = result;
    }


    // Returns true if the set is empty, false otherwise
    boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set
    public String toString() {
        if (set.isEmpty()) {
            return "[]";
        }
        return set.toString();
    }

    // Getter method for the set
    public List<Integer> getSet() {
        return set;
    }
}
