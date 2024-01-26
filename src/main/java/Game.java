public class Game {

    int turnCount;
    int numberOfPlayers;

    private Game(){}

    public static Game startGame(){
        return new Game();
    }

    public void setNumberOfPlayers(int players){
        numberOfPlayers = players;
    }

    public void setTurnCount(int count){
        turnCount = count;
    }

}