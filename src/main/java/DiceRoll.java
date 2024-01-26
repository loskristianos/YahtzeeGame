public class DiceRoll {

    int[] diceValues;

    private DiceRoll(int dice){
        generateValues(dice);
    }

    public int[] getDiceValues() {
        return diceValues;
    }

    public static DiceRoll rollDice(int dice){
        return new DiceRoll(dice);
    }

    private void generateValues(int dice){
        diceValues = new int[dice];
        for (int i=0; i < diceValues.length; i++) {
            diceValues[i] = 1+ (int) (Math.random()*6);
        }
    }
}
