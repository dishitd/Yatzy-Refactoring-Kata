package org.codingdojo.yatzy1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class YatzyCategory implements Category {

    @Override
    public int score(Die... dice) {
        var dieSet = Arrays.stream(dice)
            .collect(Collectors.toSet());
        return dieSet.size() == 1 ? 50 : 0;
    }
}
