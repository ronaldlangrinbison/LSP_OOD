package org.howard.edu.lsp.midterm.problem51;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerRangeTest {

    @Test
    public void testContains() {
        IntegerRange range = new IntegerRange(1, 10);
        assertTrue(range.contains(5));
        assertFalse(range.contains(0));
        assertFalse(range.contains(11));
    }

    @Test
    public void testOverlaps() throws EmptyRangeException {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(11, 20);

        assertTrue(range1.overlaps(range2));
        assertFalse(range1.overlaps(range3));
    }

    @Test(expected = EmptyRangeException.class)
    public void testOverlapsEmptyRangeException() throws EmptyRangeException {
        IntegerRange range1 = new IntegerRange(1, 10);
        range1.overlaps(null);
    }

    @Test
    public void testSize() {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(11, 20);

        assertEquals(10, range1.size());
        assertEquals(10, range2.size());
    }
}

