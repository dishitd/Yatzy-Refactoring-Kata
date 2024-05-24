package org.codingdojo.yatzy1;

public class NumberFivesCategory implements NumberScoreCategory {

    @Override
    public NumberScorer getNumberScorer() {
        return NumberScorer.FIVES;
    }
}
