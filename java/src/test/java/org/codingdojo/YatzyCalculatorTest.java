package org.codingdojo;

import org.codingdojo.yatzy1.Die;
import org.codingdojo.yatzy1.YatzyCalculator;
import org.junit.jupiter.api.Test;

import static org.codingdojo.yatzy1.Die.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyCalculatorTest {

    private final YatzyCalculator yatzyCalculator = new YatzyCalculator();

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = yatzyCalculator.calculate("CHANCE", Die.TWO, THREE, FOUR, FIVE, Die.ONE);
        assertEquals(expected, actual);
        assertEquals(16, yatzyCalculator.calculate("CHANCE", THREE, THREE, FOUR, FIVE, Die.ONE));
    }

    @Test
    public void yatzy_scores_50() {
        int expected = 50;
        int actual = yatzyCalculator.calculate("YATZY", FOUR, FOUR, FOUR, FOUR, FOUR, FOUR);
        assertEquals(expected, actual);
        assertEquals(50, yatzyCalculator.calculate("YATZY", SIX, SIX, SIX, SIX, SIX));
        assertEquals(0, yatzyCalculator.calculate("YATZY", SIX, SIX, SIX, SIX, THREE));
    }

    @Test
    public void test_1s() {
        assertEquals(1, yatzyCalculator.calculate("ONES", Die.ONE, Die.TWO, THREE, FOUR, FIVE));
        assertEquals(2, yatzyCalculator.calculate("ONES", Die.ONE, Die.TWO, Die.ONE, FOUR, FIVE));
        assertEquals(0, yatzyCalculator.calculate("ONES", SIX, Die.TWO, Die.TWO, FOUR, FIVE));
        assertEquals(4, yatzyCalculator.calculate("ONES", Die.ONE, Die.TWO, Die.ONE, Die.ONE, Die.ONE));
    }

    @Test
    public void test_2s() {
        assertEquals(4, yatzyCalculator.calculate("TWOS", Die.ONE, Die.TWO, THREE, Die.TWO, SIX));
        assertEquals(10, yatzyCalculator.calculate("TWOS", Die.TWO, Die.TWO, Die.TWO, Die.TWO, Die.TWO));
    }

    @Test
    public void test_threes() {
        assertEquals(6, yatzyCalculator.calculate("THREES", Die.ONE, Die.TWO, THREE, Die.TWO, THREE));
        assertEquals(12, yatzyCalculator.calculate("THREES", Die.TWO, THREE, THREE, THREE, THREE));
    }

    @Test
    public void fours_test() {
        assertEquals(12, yatzyCalculator.calculate("FOURS", FOUR, FOUR, FOUR, FIVE, FIVE));
        assertEquals(8,  yatzyCalculator.calculate("FOURS", FOUR, FIVE, FOUR, FIVE, FIVE));
        assertEquals(4, yatzyCalculator.calculate("FOURS", FIVE, FIVE, FOUR, FIVE, FIVE));
        assertEquals(0, yatzyCalculator.calculate("FOURS", FIVE, FIVE, FIVE, FIVE, FIVE));
    }

    @Test
    public void fives() {
        assertEquals(10, yatzyCalculator.calculate("FIVES", FOUR, FOUR, FOUR, FIVE, FIVE));
        assertEquals(15, yatzyCalculator.calculate("FIVES", FOUR, FIVE, FOUR, FIVE, FIVE));
        assertEquals(20, yatzyCalculator.calculate("FIVES", FIVE, FIVE, FOUR, FIVE, FIVE));
    }

    @Test
    public void sixes_test() {
        assertEquals(0, yatzyCalculator.calculate("SIXES", FOUR, FOUR, FOUR, FIVE, FIVE));
        assertEquals(6, yatzyCalculator.calculate("SIXES", FOUR, SIX, FOUR, FIVE, FIVE));
        assertEquals(18, yatzyCalculator.calculate("SIXES", SIX, SIX, FOUR, SIX, FIVE));
    }

    @Test
    public void one_pair() {
        assertEquals(6, yatzyCalculator.calculate("ONE_PAIR", THREE, FOUR, THREE, FIVE, SIX));
        assertEquals(10, yatzyCalculator.calculate("ONE_PAIR", FIVE, THREE, THREE, THREE, FIVE));
        assertEquals(12, yatzyCalculator.calculate("ONE_PAIR", FIVE, THREE, SIX, SIX, FIVE));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, yatzyCalculator.calculate("TWO_PAIR",THREE, THREE, FIVE, FOUR, FIVE));
        assertEquals(16, yatzyCalculator.calculate("TWO_PAIR",THREE, THREE, FIVE, FIVE, FIVE));
    }

    @Test
    public void three_of_a_kind() {
        assertEquals(9, yatzyCalculator.calculate("THREE_OF_A_KIND",THREE, THREE, THREE, FOUR, FIVE));
        assertEquals(15, yatzyCalculator.calculate("THREE_OF_A_KIND", FIVE, THREE, FIVE, FOUR, FIVE));
        assertEquals(9, yatzyCalculator.calculate("THREE_OF_A_KIND", THREE, THREE, THREE, THREE, FIVE));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, yatzyCalculator.calculate("FOUR_OF_A_KIND",THREE, THREE, THREE, THREE, FIVE));
        assertEquals(20, yatzyCalculator.calculate("FOUR_OF_A_KIND",FIVE, FIVE, FIVE, FOUR, FIVE));
        assertEquals(12, yatzyCalculator.calculate("FOUR_OF_A_KIND",THREE, THREE, THREE, THREE, THREE));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, yatzyCalculator.calculate("SMALL_STRAIGHT", ONE, TWO, THREE, FOUR, FIVE));
        assertEquals(15, yatzyCalculator.calculate("SMALL_STRAIGHT",TWO, THREE, FOUR, FIVE, ONE));
        assertEquals(0, yatzyCalculator.calculate("SMALL_STRAIGHT", ONE, TWO, TWO, FOUR, FIVE));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, yatzyCalculator.calculate("LARGE_STRAIGHT", SIX, TWO, THREE, FOUR, FIVE));
        assertEquals(20, yatzyCalculator.calculate("LARGE_STRAIGHT", TWO, THREE, FOUR, FIVE, SIX));
        assertEquals(0, yatzyCalculator.calculate("LARGE_STRAIGHT",ONE, TWO, TWO, FOUR, FIVE));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, yatzyCalculator.calculate("FULL_HOUSE",SIX, TWO, TWO, TWO, SIX));
        assertEquals(0, yatzyCalculator.calculate("FULL_HOUSE", TWO, THREE, FOUR, FIVE, SIX));
    }
}
