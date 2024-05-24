package org.codingdojo.yatzy1;

public class NumberOnesCategory implements NumberScoreCategory {

    @Override
    public NumberScorer getNumberScorer() {
        return NumberScorer.ONES;
    }
}
