package org.codingdojo.yatzy1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ThreeOfKindCategory implements Category {

    @Override
    public int score(Die... dice) {
        return Arrays.stream(dice)
            .collect(Collectors.groupingBy(Die::getValue, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() >= 3)
            .mapToInt(entry -> entry.getKey() * 3)
            .findAny()
            .orElse(0);
    }
}
