public class DiceFactory {

    private DiceFactory(){}

    public static Dice newDice(){
        Dice dice = new Dice();
        dice.roll();
        return dice;
    }

}
