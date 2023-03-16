package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
    private int lower;
    private int upper;

    IntegerRange(int lower, int upper) { // Constructor
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    @Override
    public boolean contains(int value) {
        return value >= lower && value <= upper;
    }

    @Override
    public boolean overlaps(Range other) throws EmptyRangeException {
        if (other == null) {
            throw new EmptyRangeException("Null Range object passed.");
        }
        IntegerRange otherRange = (IntegerRange) other;
        return otherRange.getUpper() >= lower && otherRange.getLower() <= upper;
    }

    @Override
    public int size() {
        return upper - lower + 1;
    }
}

