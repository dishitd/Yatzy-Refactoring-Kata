package org.codingdojo.yatzy1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmallStraightCategory implements Category {

    @Override
    public int score(Die... dice) {
        var dieSet = Arrays.stream(dice)
            .collect(Collectors.toSet());
        var sum = dieSet.stream()
            .mapToInt(Die::getValue)
            .sum();
        return dieSet.size() == 5 && sum == 15 ? sum : 0;
    }
}
