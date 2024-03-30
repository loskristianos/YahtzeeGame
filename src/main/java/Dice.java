public class Dice {

    private Integer value;

    public Dice(){}

    public void roll(){
        setValue(1 + (int)(Math.random()*6));
    }

    public Integer getValue(){
        return value;
    }

    private void setValue(Integer value){
        this.value = value;
    }

}
