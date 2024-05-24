package org.codingdojo.yatzy1;

import java.util.Arrays;

public class ChanceCategory implements Category {

    @Override
    public int score(Die... dice) {
        return Arrays.stream(dice)
            .mapToInt(Die::getValue)
            .sum();
    }
}
