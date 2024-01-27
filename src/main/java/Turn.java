/*
    For each turn (a new Turn instance per player's turn) player has three rolls of the dice;
    after each roll the player can choose whether to re-roll all five dice, keep the five
    dice to score with, or keep 1-4 dice as they are and roll the remaining dice for the
    second/third roll. After the third roll the five dice must be used for scoring.
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Turn{

    private Player player;
    private int rollCount;          // number of rolls taken this turn
    private int[] diceValues;       // face values of all 5 dice (updated after each roll)
    private int diceHeld;           // number of dice held back (updated for each roll)
    private int[] heldDiceValues;   // face values of the dice held back (updated for each roll)

    private Turn(){}

    public static Turn startNewTurn(Player player){
        Turn newTurn = new Turn();
        newTurn.setPlayer(player);
        return newTurn;
    }

    private void setPlayer(Player player) {
        this.player = player;
    }

    public int getRollCount(){
        return rollCount;
    }

    public int[] getDiceValues(){
        return diceValues;
    }

    public int[] getHeldDiceValues(){
        return heldDiceValues;
    }

    public int getDiceHeld() {
        return diceHeld;
    }

    public void firstRoll(){
        DiceRoll firstDiceRoll = DiceRoll.rollDice(5);
        rollCount = 1;
        diceValues = firstDiceRoll.getDiceValues();
    }

    public void secondRoll(){
        DiceRoll secondDiceRoll = DiceRoll.rollDice(5-diceHeld);
        int[] result = secondDiceRoll.getDiceValues();
        rollCount = 2;
        if (diceHeld > 0) {
            diceValues = IntStream.concat(Arrays.stream(heldDiceValues), Arrays.stream(result)).toArray();
        }
        else diceValues = result;
    }

    public void thirdRoll(){
        DiceRoll thirdDiceRoll = DiceRoll.rollDice(5-diceHeld);
        rollCount = 3;
        int[] result = thirdDiceRoll.getDiceValues();
        if (diceHeld > 0) {
            diceValues = IntStream.concat(Arrays.stream(heldDiceValues), Arrays.stream(result)).toArray();
        }
        else diceValues = result;
    }

    public void holdDice(int[] diceToHold){
        diceHeld = diceToHold.length;
        int[] heldValues = new int[diceHeld];
        for (int i = 0; i < diceToHold.length; i++){
            heldValues[i] = diceValues[diceToHold[i]];
        }
        heldDiceValues = heldValues.clone();
    }
}