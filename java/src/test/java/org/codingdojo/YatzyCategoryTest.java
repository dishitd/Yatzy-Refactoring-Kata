package org.codingdojo;

import org.codingdojo.yatzy1.Die;
import org.codingdojo.yatzy1.YatzyCategory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyCategoryTest {

    private final YatzyCategory yatzyCategory = new YatzyCategory();

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 50;
        int actual = yatzyCategory.score(Die.FOUR, Die.FOUR, Die.FOUR, Die.FOUR, Die.FOUR, Die.FOUR);
        assertEquals(expected, actual);
        assertEquals(50, yatzyCategory.score(Die.SIX,Die.SIX,Die.SIX,Die.SIX,Die.SIX));
        assertEquals(0, yatzyCategory.score(Die.SIX,Die.SIX,Die.SIX,Die.SIX,Die.THREE));
    }
}
