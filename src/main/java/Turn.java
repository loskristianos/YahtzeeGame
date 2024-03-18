/*
    For each turn (a new Turn instance per player's turn) player has three rolls of the dice;
    after each roll the player can choose whether to re-roll all five dice, keep the five
    dice to score with, or keep 1-4 dice as they are and roll the remaining dice for the
    second/third roll. After the third roll the five dice must be used for scoring.
 */

public class Turn {

    private Player player;
    private Integer rollCount;
    private Dice dice1;
    private Dice dice2;
    private Dice dice3;
    private Dice dice4;
    private Dice dice5;
    private Integer[] diceValues;

    private Turn(){
    }

    public static Turn startNewTurn(Player player){
        Turn newTurn = new Turn();
        newTurn.setPlayer(player);
        return newTurn;
    }
    private void setPlayer(Player player){
        this.player = player;
    }

    public Integer getRollCount(){
        return rollCount;
    }

    public Integer[] getDiceValues(){
        return diceValues;
    }

    public Integer getDice1Value(){
        return dice1.getValue();
    }

    public Integer getDice2Value(){
        return dice2.getValue();
    }

    public Integer getDice3Value(){
        return dice3.getValue();
    }

    public Integer getDice4Value(){
        return dice4.getValue();
    }

    public Integer getDice5Value(){
        return dice5.getValue();
    }

    public void firstRoll(){
        dice1 = DiceFactory.newDice();
        dice2 = DiceFactory.newDice();
        dice3 = DiceFactory.newDice();
        dice4 = DiceFactory.newDice();
        dice5 = DiceFactory.newDice();
        rollCount = 1;
        diceValues = new Integer[5];
        updateDiceValues();
    }

    public void nextRoll(Integer[] diceToRoll){
        for (int i=0; i < diceToRoll.length; i++){
            switch (diceToRoll[i]){
                case 1: dice1.roll();
                case 2: dice2.roll();
                case 3: dice3.roll();
                case 4: dice4.roll();
                case 5: dice5.roll();
            }
        }
        updateDiceValues();
        rollCount = rollCount + 1;
    }

    private void updateDiceValues(){
        diceValues[0] = dice1.getValue();
        diceValues[1] = dice2.getValue();
        diceValues[2] = dice3.getValue();
        diceValues[3] = dice4.getValue();
        diceValues[4] = dice5.getValue();
    }
}
