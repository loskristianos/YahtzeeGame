public class Dice {

    private Integer value;

    private Dice(){}

    public Dice rollDice(){
        Dice dice = new Dice();
        dice.roll();
        return dice;
    }
    private void roll(){
        setValue(1 + (int)(Math.random()*6));
    }

    public Integer getValue(){
        return value;
    }

    private void setValue(Integer value){
        this.value = value;
    }

}
