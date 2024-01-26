import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollTest {

    @Test
    void rollFiveDice() {
        DiceRoll testRoll = DiceRoll.rollDice(5);
        int[] result = testRoll.getDiceValues();
        assertEquals(5, result.length);
    }

    @Test
    void rollThreeDice() {
        DiceRoll testRoll = DiceRoll.rollDice(3);
        int[] result = testRoll.getDiceValues();
        assertEquals(3, result.length);
    }

    @Test
    void diceValuesInRange() {
        DiceRoll testRoll = DiceRoll.rollDice(5);
        int[] result = testRoll.getDiceValues();
        for (int i=0; i < result.length; i++) {
            assertTrue(result[i]<=6);
            assertTrue(result[i]>0);
        }
    }
}