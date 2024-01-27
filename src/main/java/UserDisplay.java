import java.util.Arrays;

public class UserDisplay {

    public void displayDice(int[] diceValues){
        // display face values of rolled dice to user
        System.out.println(Arrays.toString(diceValues));
    }

    public void displayScoreCard(ScoreCard scoreCard){
        System.out.println("Yahtzee");
        System.out.println("Upper Section");
        System.out.println("Aces: " + scoreCard.getAces());
        System.out.println("Twos: " + scoreCard.getTwos());
        System.out.println("Threes: " + scoreCard.getThrees());
        System.out.println("Fours: " + scoreCard.getFours());
        System.out.println("Fives: " + scoreCard.getFives());
        System.out.println("Sixes: " + scoreCard.getSixes());
        System.out.println("Total Score: " + scoreCard.getUpperScore());
        System.out.println("Bonus: " + scoreCard.getUpperBonus());
        System.out.println("Total: " + scoreCard.getUpperTotal());
        System.out.println("============");
        System.out.println("Lower Section");
        System.out.println("3 of a Kind: " + scoreCard.getThreeOfAKind());
        System.out.println("4 of a Kind" + scoreCard.getFourOfAKind());
        System.out.println("Full House: " + scoreCard.getFullHouse());
        System.out.println("Small Straight: " + scoreCard.getSmallStraight());
        System.out.println("Large Straight: " + scoreCard.getLargeStraight());
        System.out.println("Yahtzee: " + scoreCard.getYahtzee());
        System.out.println("Chance: " + scoreCard.getChance());
        System.out.println("Yahtzee Bonus: " + scoreCard.getYahtzeeBonuses());
        System.out.println("Total of Lower Section: " + scoreCard.getLowerTotal());
        System.out.println("Total of Upper Section: " + scoreCard.getUpperTotal());
        System.out.println("Grand Total: " + scoreCard.getGrandTotal());
    }
}
