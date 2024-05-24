package org.codingdojo.yatzy1;

public class NumberThreesCategory implements NumberScoreCategory {

    @Override
    public NumberScorer getNumberScorer() {
        return NumberScorer.THREES;
    }
}
