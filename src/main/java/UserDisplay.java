import java.util.Arrays;

public class UserDisplay {

    public void displayDice(Integer[] diceValues){
        // display face values of rolled dice to user
        System.out.println(Arrays.toString(diceValues));
    }

    public void displayScoreCard(ScoreCard scoreCard){
        System.out.println("Yahtzee");
        System.out.println("Upper Section");
        System.out.println("[1] Aces: " + scoreCard.getAces());
        System.out.println("[2] Twos: " + scoreCard.getTwos());
        System.out.println("[3] Threes: " + scoreCard.getThrees());
        System.out.println("[4] Fours: " + scoreCard.getFours());
        System.out.println("[5] Fives: " + scoreCard.getFives());
        System.out.println("[6] Sixes: " + scoreCard.getSixes());
        System.out.println("Total Score: " + scoreCard.getUpperScore());
        System.out.println("Bonus: " + scoreCard.getUpperBonus());
        System.out.println("Total: " + scoreCard.getUpperTotal());
        System.out.println("============");
        System.out.println("Lower Section");
        System.out.println("[7] 3 of a Kind: " + scoreCard.getThreeOfAKind());
        System.out.println("[8] 4 of a Kind: " + scoreCard.getFourOfAKind());
        System.out.println("[9] Full House: " + scoreCard.getFullHouse());
        System.out.println("[10] Small Straight: " + scoreCard.getSmallStraight());
        System.out.println("[11] Large Straight: " + scoreCard.getLargeStraight());
        System.out.println("[12] Yahtzee: " + scoreCard.getYahtzee());
        System.out.println("[13] Chance: " + scoreCard.getChance());
        System.out.println("Yahtzee Bonus: " + scoreCard.getYahtzeeBonuses());
        System.out.println("Total of Lower Section: " + scoreCard.getLowerTotal());
        System.out.println("Total of Upper Section: " + scoreCard.getUpperTotal());
        System.out.println("Grand Total: " + scoreCard.getGrandTotal());
    }
}
