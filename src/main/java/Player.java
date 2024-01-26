public class Player {

    String name;
    ScoreCard scoreCard;
    Integer totalScore;
    Integer numberOfTurns;

    private Player(){}

    public static Player startNewGame(){
        Player player = new Player();
        player.setScoreCard(ScoreCard.newScoreCard());
        player.setNumberOfTurns(0);
        return player;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreCard getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(ScoreCard scoreCard) {
        this.scoreCard = scoreCard;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getNumberOfTurns(){
        return numberOfTurns;
    }

    public void setNumberOfTurns(Integer numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }
}
