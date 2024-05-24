package org.codingdojo.yatzy1;

public class NumberSixesCategory implements NumberScoreCategory {

    @Override
    public NumberScorer getNumberScorer() {
        return NumberScorer.SIXES;
    }
}
