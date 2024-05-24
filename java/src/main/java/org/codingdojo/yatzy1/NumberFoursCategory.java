package org.codingdojo.yatzy1;

public class NumberFoursCategory implements NumberScoreCategory {

    @Override
    public NumberScorer getNumberScorer() {
        return NumberScorer.FOURS;
    }
}
