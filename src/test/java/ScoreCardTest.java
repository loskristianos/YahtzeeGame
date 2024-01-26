import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCardTest {

    @Test
    void setAces() {
        int[] acesTest = new int[]{1,4,5,1,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setAces(acesTest);
        assertEquals(2, testCard.getAces());
    }

    @Test
    void setAcesZero(){
        int[] acesZero = new int[]{2,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setAces(acesZero);
        assertEquals(0, testCard.getAces());
    }

    @Test
    void setTwos() {
        int[] twosTest = new int[]{2,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setTwos(twosTest);
        assertEquals(6, testCard.getTwos());
    }

    @Test
    void setThrees() {
        int[] threesTest = new int[]{2,1,4,2,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setThrees(threesTest);
        assertEquals(3, testCard.getThrees());
    }

    @Test
    void setFours() {
        int[] foursTest = new int[]{4,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFours(foursTest);
        assertEquals(8, testCard.getFours());
    }

    @Test
    void setFives() {
        int[] fivesTest = new int[]{2,5,5,2,5};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFives(fivesTest);
        assertEquals(15, testCard.getFives());
    }

    @Test
    void setSixes() {
        int[] sixesTest = new int[]{2,6,4,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setSixes(sixesTest);
        assertEquals(6, testCard.getSixes());
    }

    @Test
    void setThreeOfAKind() {
        int[] threeOfAKindTest = new int[]{2,5,2,4,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setThreeOfAKind(threeOfAKindTest);
        assertEquals(15, testCard.getThreeOfAKind());
    }

    @Test
    void setThreeOfAKindFail() {
        int[] threeOfAKindTest = new int[]{2,5,1,4,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setThreeOfAKind(threeOfAKindTest);
        assertEquals(0, testCard.getThreeOfAKind());
    }

    @Test
    void setFourOfAKind() {
        int[] fourOfAKindTest = new int[]{1,1,3,1,1};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFourOfAKind(fourOfAKindTest);
        assertEquals(7, testCard.getFourOfAKind());
    }

    @Test
    void setFourOfAKindFail() {
        int[] fourOfAKindTest = new int[]{2,5,1,4,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFourOfAKind(fourOfAKindTest);
        assertEquals(0, testCard.getFourOfAKind());
    }

    @Test
    void setFullHouse() {
        int[] fullHouse = new int[]{4,3,4,4,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFullHouse(fullHouse);
        assertEquals(25, testCard.getFullHouse());
    }

    @Test
    void setFullHouseFail() {
        int[] fullHouse = new int[]{1,3,4,4,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFullHouse(fullHouse);
        assertEquals(0, testCard.getFullHouse());
    }

    @Test
    void setFullHouseFail2() {
        int[] fullHouse = new int[]{3,3,3,3,3};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setFullHouse(fullHouse);
        assertEquals(0, testCard.getFullHouse());
    }

    @Test
    void setSmallStraight() {
    }

    @Test
    void setLargeStraight() {
    }

    @Test
    void setYahtzee() {
        int[] yahtzee = new int[]{5,5,5,5,5};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setYahtzee(yahtzee);
        assertEquals(50, testCard.getYahtzee());
    }

    @Test
    void setChance() {
    }

    @Test
    void setYahtzeeBonuses() {
        int[] yahtzee = new int[]{5,5,5,5,5};
        int[] yahtzee1 = new int[]{2,2,2,2,2};
        ScoreCard testCard = ScoreCard.newScoreCard();
        testCard.setYahtzee(yahtzee);
        assertEquals(50, testCard.getYahtzee());
        assertNull(testCard.getYahtzeeBonuses());
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