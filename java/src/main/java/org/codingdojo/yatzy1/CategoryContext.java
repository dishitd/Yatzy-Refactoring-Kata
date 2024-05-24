package org.codingdojo.yatzy1;

public class CategoryContext {

    public Category getCategory(String category) {
        return switch (category) {
            case "CHANCE" -> new ChanceCategory();
            case "YATZY" -> new YatzyCategory();
            case "ONES" -> new NumberOnesCategory();
            case "TWOS" -> new NumberTwosCategory();
            case "THREES" -> new NumberThreesCategory();
            case "FOURS" -> new NumberFoursCategory();
            case "FIVES" -> new NumberFivesCategory();
            case "SIXES" -> new NumberSixesCategory();
            case "ONE_PAIR" -> new OnePairCategory();
            case "TWO_PAIR" -> new TwoPairCategory();
            case "THREE_OF_A_KIND" -> new ThreeOfKindCategory();
            case "FOUR_OF_A_KIND" -> new FourOfKindCategory();
            case "SMALL_STRAIGHT" -> new SmallStraightCategory();
            case "LARGE_STRAIGHT" -> new LargeStraightCategory();
            case "FULL_HOUSE" -> new FullHouseCategory();
            default -> throw new IllegalStateException("Unexpected value: " + category);
        };
    }
}
