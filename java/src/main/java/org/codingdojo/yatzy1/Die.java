package org.codingdojo.yatzy1;

public enum Die {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    Die(int value) {
        this.value = value;
    }

    // Method to retrieve the integer value
    public int getValue() {
        return value;
    }
    private final int value;
}
