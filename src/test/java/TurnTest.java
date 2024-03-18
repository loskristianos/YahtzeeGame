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
        // test that method returns an array of five values each between 1 and 6 inclusive
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        turn.firstRoll();
        Integer[] diceValues = turn.getDiceValues();
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
        Integer[] diceToRoll = new Integer[]{1,2,3,4,5};
        turn.firstRoll();
        turn.nextRoll(diceToRoll);
        assertEquals(2, turn.getRollCount());
        assertEquals(5, turn.getDiceValues().length);
    }

    @Test
    void thirdRoll() {
        Player x = Player.startNewGame();
        Turn turn = Turn.startNewTurn(x);
        Integer[] diceToRoll = new Integer[]{1,2,3,4,5};
        turn.firstRoll();
        turn.nextRoll(diceToRoll);
        turn.nextRoll(diceToRoll);
        assertEquals(3, turn.getRollCount());
        assertEquals(5, turn.getDiceValues().length);
    }

}