import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurnTest {

    @Test
    void startNewTurn() {
        Player x = Player.startNewGame();
        assertInstanceOf(Turn.class, Turn.startNewTurn(x));
    }

    @Test
    void getRollCount() {
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        assertEquals(1, turn.getRollCount());
    }

    @Test
    void getDiceValues() {
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        int[] diceValues = turn.getDiceValues();
        assertEquals(5, diceValues.length);
        for (int i = 0; i < diceValues.length; i++){
            assertTrue(diceValues[i] > 0);
            assertTrue(diceValues[i] <= 6);
        }
    }

    @Test
    void firstRoll() {
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        assertEquals(1, turn.getRollCount());
        assertEquals(5, turn.getDiceValues().length);
    }

    @Test
    void secondRoll() {
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        turn.secondRoll();
        assertEquals(2, turn.getRollCount());
        assertEquals(5, turn.getDiceValues().length);
    }

    @Test
    void thirdRoll() {
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        turn.secondRoll();
        turn.thirdRoll();
        assertEquals(3, turn.getRollCount());
        assertEquals(5, turn.getDiceValues().length);
    }

    @Test
    void holdDice() {
        int[] diceToHold = new int[]{1,3};
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        turn.holdDice(diceToHold);
        int[] heldDiceValues = turn.getHeldDiceValues();
        int[] diceValues = turn.getDiceValues();
        int[] expectedResult = new int[]{diceValues[1],diceValues[3]};
        assertArrayEquals(expectedResult, heldDiceValues);
        assertEquals(2, turn.getDiceHeld());
    }
}