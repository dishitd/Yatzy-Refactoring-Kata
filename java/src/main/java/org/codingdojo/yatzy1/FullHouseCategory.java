package org.codingdojo.yatzy1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FullHouseCategory implements Category {

    @Override
    public int score(Die... dice) {
        var pairs = Arrays.stream(dice)
            .collect(Collectors.groupingBy(Die::getValue, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() == 2)
            .map(Map.Entry::getKey)
            .toList();
        var threeOfKind = Arrays.stream(dice)
            .collect(Collectors.groupingBy(Die::getValue, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() == 3)
            .map(Map.Entry::getKey)
            .toList();
        if (pairs.size() == 1 && threeOfKind.size() == 1) {
             return pairs.get(0) * 2 + threeOfKind.get(0) * 3;
        }
        return 0;
    }
}
