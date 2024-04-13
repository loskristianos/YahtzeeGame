package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCardTest {

    @Test
    void setAces() {
        Integer[] acesTest = new Integer[]{1,4,5,1,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setAces(acesTest);
        assertEquals(2, testCard.getAces());
    }

    @Test
    void setAcesZero(){
        Integer[] acesZero = new Integer[]{2,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setAces(acesZero);
        assertEquals(0, testCard.getAces());
    }

    @Test
    void setTwos() {
        Integer[] twosTest = new Integer[]{2,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setTwos(twosTest);
        assertEquals(6, testCard.getTwos());
    }

    @Test
    void setThrees() {
        Integer[] threesTest = new Integer[]{2,1,4,2,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setThrees(threesTest);
        assertEquals(3, testCard.getThrees());
    }

    @Test
    void setFours() {
        Integer[] foursTest = new Integer[]{4,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFours(foursTest);
        assertEquals(8, testCard.getFours());
    }

    @Test
    void setFives() {
        Integer[] fivesTest = new Integer[]{2,5,5,2,5};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFives(fivesTest);
        assertEquals(15, testCard.getFives());
    }

    @Test
    void setSixes() {
        Integer[] sixesTest = new Integer[]{2,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setSixes(sixesTest);
        assertEquals(6, testCard.getSixes());
    }

    @Test
    void setThreeOfAKind() {
        Integer[] threeOfAKindTest = new Integer[]{2,5,2,4,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setThreeOfAKind(threeOfAKindTest);
        assertEquals(15, testCard.getThreeOfAKind());
    }

    @Test
    void setThreeOfAKindFail() {
        Integer[] threeOfAKindTest = new Integer[]{2,5,1,4,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setThreeOfAKind(threeOfAKindTest);
        assertEquals(0, testCard.getThreeOfAKind());
    }

    @Test
    void setFourOfAKind() {
        Integer[] fourOfAKindTest = new Integer[]{1,1,3,1,1};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFourOfAKind(fourOfAKindTest);
        assertEquals(7, testCard.getFourOfAKind());
    }

    @Test
    void setFourOfAKindFail() {
        Integer[] fourOfAKindTest = new Integer[]{2,5,1,4,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFourOfAKind(fourOfAKindTest);
        assertEquals(0, testCard.getFourOfAKind());
    }

    @Test
    void setFullHouse() {
        Integer[] fullHouse = new Integer[]{4,3,4,4,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFullHouse(fullHouse);
        assertEquals(25, testCard.getFullHouse());
    }

    @Test
    void setFullHouseFail() {
        Integer[] fullHouse = new Integer[]{1,3,4,4,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFullHouse(fullHouse);
        assertEquals(0, testCard.getFullHouse());
    }

    @Test
    void setFullHouseFail2() {
        Integer[] fullHouse = new Integer[]{3,3,3,3,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFullHouse(fullHouse);
        assertEquals(0, testCard.getFullHouse());
    }

    @Test
    void setSmallStraight() {
        Integer[] smallStraight = new Integer[]{1,6,3,2,4};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setSmallStraight(smallStraight);
        assertEquals(30, testCard.getSmallStraight());
    }

    @Test
    void setLargeStraight() {
        Integer[] largeStraight = new Integer[]{6,2,4,3,5};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setLargeStraight(largeStraight);
        assertEquals(40, testCard.getLargeStraight());
    }

    @Test
    void setYahtzee() {
        Integer[] yahtzee = new Integer[]{5,5,5,5,5};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setYahtzee(yahtzee);
        assertEquals(50, testCard.getYahtzee());
    }

    @Test
    void setChance() {
        Integer[] chance = new Integer[]{4,4,6,2,1};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setChance(chance);
        assertEquals(17, testCard.getChance());
    }

    @Test
    void setYahtzeeBonuses() {
        Integer[] yahtzee = new Integer[]{5,5,5,5,5};
        Integer[] yahtzee1 = new Integer[]{2,2,2,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setYahtzee(yahtzee);
        assertEquals(50, testCard.getYahtzee());
        assertEquals(0,testCard.getYahtzeeBonuses());
        testCard.setYahtzeeBonuses(yahtzee1);
        assertEquals(1, testCard.getYahtzeeBonuses());
    }

    @Test
    void setLowerTotal() {
    }

    @Test
    void setGrandTotal() {
    }
}