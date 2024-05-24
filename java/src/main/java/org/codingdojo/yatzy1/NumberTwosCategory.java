package org.codingdojo.yatzy1;

public class NumberTwosCategory implements NumberScoreCategory {

    @Override
    public NumberScorer getNumberScorer() {
        return NumberScorer.TWOS;
    }
}
