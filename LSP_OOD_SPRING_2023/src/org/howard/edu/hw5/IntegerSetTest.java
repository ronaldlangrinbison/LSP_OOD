package org.howard.edu.hw5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

    private IntegerSet set;

    @BeforeEach
    public void setup() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.clear();
        Assertions.assertEquals(0, set.length());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        set.add(1);
        set.add(2);
        set.add(3);
        Assertions.assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        Assertions.assertTrue(set.equals(set2));
        set2.add(4);
        Assertions.assertFalse(set.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set.add(1);
        set.add(2);
        set.add(3);
        Assertions.assertTrue(set.contains(2));
        Assertions.assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        set.add(1);
        set.add(2);
        set.add(3);
        Assertions.assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for largest() method on empty set")
    void testLargestException() {
        IntegerSet set = new IntegerSet();
        try {
            set.largest();
            fail("Expected an IntegerSetException to be thrown");
        } catch (IntegerSetException e) {
            assertEquals("Cannot get largest value from empty set.", e.getMessage());
        }
    }
    
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        set.add(1);
        set.add(2);
        set.add(3);
        Assertions.assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for smallest() method on empty set")
    void testSmallestException() {
        IntegerSet set = new IntegerSet();
        try {
            set.smallest();
            fail("Expected an IntegerSetException to be thrown");
        } catch (IntegerSetException e) {
            assertEquals("Cannot get smallest value from empty set.", e.getMessage());
        }
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        Assertions.assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);
        Assertions.assertEquals(2, set.length());
        Assertions.assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set.union(set2);
        Assertions.assertEquals(5, set.length());
        Assertions.assertTrue(set.contains(1));
        Assertions.assertTrue(set.contains(2));
        Assertions.assertTrue(set.contains(3));
        Assertions.assertTrue(set.contains(4));
        Assertions.assertTrue(set.contains(5));
    }

    @Test
    @DisplayName("Test case for intersection")
    public void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set.intersect(set2);
        Assertions.assertEquals(2, set.length());
        Assertions.assertFalse(set.contains(1));
        Assertions.assertTrue(set.contains(2));
        Assertions.assertTrue(set.contains(3));
        Assertions.assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set.diff(set2);
        Assertions.assertEquals(1, set.length());
        Assertions.assertTrue(set.contains(1));
        Assertions.assertFalse(set.contains(2));
        Assertions.assertFalse(set.contains(3));
        Assertions.assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        Assertions.assertTrue(set.isEmpty());
        set.add(1);
        Assertions.assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set.add(1);
        set.add(2);
        set.add(3);
        Assertions.assertEquals("[1, 2, 3]", set.toString());
    }

}
















