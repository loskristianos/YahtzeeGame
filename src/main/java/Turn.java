public class Turn{

    Player player;
    int rollCount;
    int[] heldDice;

    private Turn(){}

    public static Turn startNewTurn(Player player){
        Turn newTurn = new Turn();
        newTurn.setPlayer(player);
        return newTurn;
    }

    private void setPlayer(Player player) {
        this.player = player;
    }
    
}