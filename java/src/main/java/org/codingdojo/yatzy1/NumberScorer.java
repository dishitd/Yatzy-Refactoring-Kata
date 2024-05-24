package org.codingdojo.yatzy1;

public enum NumberScorer {
    ONES(1),
    TWOS(2),
    THREES(3),
    FOURS(4),
    FIVES(5),
    SIXES(6);

    NumberScorer(int value) {
        this.value = value;
    }

    // Method to retrieve the integer value
    public int getValue() {
        return value;
    }
    private final int value;
}
