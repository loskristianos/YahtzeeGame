package game;

import cli.UserDisplay;
import cli.UserPrompt;

public class Game {

    int turnCount;
    int numberOfPlayers;
    Player player;
    UserDisplay userDisplay;
    UserPrompt userPrompt;

    private Game(){}

    public static Game startGame(){
        Game game = new Game();
        game.setPlayer(Player.startNewGame());
        return game;
    }

    public void setNumberOfPlayers(int players){
        numberOfPlayers = players;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public void setTurnCount(int count){
        turnCount = count;
    }

    public int getTurnCount(){
        return turnCount;
    }

    public void play(){
        UserDisplay userDisplay = new UserDisplay();
        UserPrompt userPrompt = new UserPrompt();
        turnCount = 1;
        while (turnCount < 14) {
            Turn turn = Turn.startNewTurn(player);
            turn.firstRoll();
            userDisplay.displayDice(turn);
            if (userPrompt.rollAgain().equals("y")) {
                turn.nextRoll(userPrompt.chooseDiceToRoll());
                userDisplay.displayDice(turn);
                if (userPrompt.rollAgain().equals("y")) {
                    turn.nextRoll(userPrompt.chooseDiceToRoll());
                    userDisplay.displayDice(turn);
                }
            }
            userDisplay.displayScoreCard(player.getScoreCard());
            int x = userPrompt.scoreCardSection();
            player.getScoreCard().setScore(x, turn.getDiceValues());
            // set score
            setTurnCount(turnCount+1);
        }
        System.out.println("End of game. Here is your final score.");
        userDisplay.displayScoreCard(player.getScoreCard());
    }
}