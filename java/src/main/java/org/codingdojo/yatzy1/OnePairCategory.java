package org.codingdojo.yatzy1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OnePairCategory implements Category {

    @Override
    public int score(Die... dice) {
        return Arrays.stream(dice)
            .collect(Collectors.groupingBy(Die::getValue, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() >= 2)
            .mapToInt(Map.Entry::getKey)
            .max()
            .orElse(0) * 2;
    }
}
