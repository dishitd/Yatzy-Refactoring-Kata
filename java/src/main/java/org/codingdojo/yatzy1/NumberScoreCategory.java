package org.codingdojo.yatzy1;

import java.util.Arrays;

public interface NumberScoreCategory extends Category {

    NumberScorer getNumberScorer();

    default int score(Die ...dice) {
        return Arrays.stream(dice)
            .filter(die -> die.getValue() == getNumberScorer().getValue())
            .mapToInt(Die::getValue)
            .sum();
    }
}
