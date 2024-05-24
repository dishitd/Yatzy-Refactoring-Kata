package org.codingdojo.yatzy1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoPairCategory implements Category {

    @Override
    public int score(Die... dice) {
        var pairs = Arrays.stream(dice)
            .collect(Collectors.groupingBy(Die::getValue, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() >= 2)
            .map(Map.Entry::getKey)
            .toList();

        if (pairs.size() < 2) {
            return 0;
        }
        return pairs.get(0) * 2 + pairs.get(1) * 2;
    }
}
