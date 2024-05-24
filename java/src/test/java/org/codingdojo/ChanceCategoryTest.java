package org.codingdojo;

import org.codingdojo.yatzy1.ChanceCategory;
import org.codingdojo.yatzy1.Die;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceCategoryTest {

    private final ChanceCategory chanceCategory = new ChanceCategory();

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual =chanceCategory.score(Die.TWO, Die.THREE, Die.FOUR, Die.FIVE, Die.ONE);
        assertEquals(expected, actual);
        assertEquals(16, chanceCategory.score(Die.THREE,Die.THREE,Die.FOUR,Die.FIVE,Die.ONE));
    }
}
