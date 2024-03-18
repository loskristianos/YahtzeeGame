import java.util.Arrays;
import java.util.List;

public class ScoreCard {

    // upper section scores

    private Integer aces;
    private Integer twos;
    private Integer threes;
    private Integer fours;
    private Integer fives;
    private Integer sixes;
    private Integer upperScore;
    private Integer upperBonus;
    private Integer upperTotal;

    // lower section scores

    private Integer threeOfAKind;
    private Integer fourOfAKind;
    private Integer fullHouse;
    private Integer smallStraight;
    private Integer largeStraight;
    private Integer yahtzee;
    private Integer chance;
    private Integer yahtzeeBonuses;
    private Integer lowerTotal;
    private Integer grandTotal;

    private ScoreCard(){}

    public static ScoreCard newScoreCard(){
        return new ScoreCard();
    }

    public ScoreCard getScoreCard(){
        return this;
    }

    // get individual values
    public Integer getAces() {
        return aces;
    }

    public Integer getTwos() {
        return twos;
    }

    public Integer getThrees() {
        return threes;
    }

    public Integer getFours() {
        return fours;
    }

    public Integer getFives() {
        return fives;
    }

    public Integer getSixes() {
        return sixes;
    }

    public Integer getUpperScore() {
        if (aces!=null && twos!=null && threes!=null && fours!=null && fives!=null && sixes!=null ) {
            return (aces + twos + threes + fours + fives + sixes);
        } else return null;
    }

    public Integer getUpperBonus() {
        if (getUpperScore()==null) return null;
        else if (getUpperScore()>=63) return 35;
        else return 0;
    }

    public Integer getUpperTotal() {
        if (getUpperScore()==null || getUpperBonus()==null) return null;
        else return getUpperScore() + getUpperBonus();
    }

    public Integer getThreeOfAKind() {
        return threeOfAKind;
    }

    public Integer getFourOfAKind() {
        return fourOfAKind;
    }

    public Integer getFullHouse() {
        return fullHouse;
    }

    public Integer getSmallStraight() {
        return smallStraight;
    }

    public Integer getLargeStraight() {
        return largeStraight;
    }

    public Integer getYahtzee() {
        return yahtzee;
    }

    public Integer getChance() {
        return chance;
    }

    public Integer getYahtzeeBonuses() {
        if (yahtzeeBonuses==null) return 0;
        else return yahtzeeBonuses;
    }

    public Integer getLowerTotal() {
        if (getThreeOfAKind()!=null && getFourOfAKind()!=null && getFullHouse()!=null &&
                getSmallStraight()!=null && getLargeStraight()!=null && getYahtzee()!=null && getChance()!=null){
            return threeOfAKind + fourOfAKind + fullHouse + smallStraight + largeStraight + yahtzee + chance + (getYahtzeeBonuses()*100);
        }
        else return null;
    }

    public Integer getGrandTotal() {
        if (getUpperTotal()==null || getLowerTotal()==null) return null;
        else return getLowerTotal() + getUpperTotal();
    }

    // set values / calculate scores

    private Integer calculateUpperScores(Integer[] diceValues, Integer faceValue){
        // calculate the score for each of the upper sections (sum of matching face values for section)
        Integer score = 0;
        for (int i=0; i<5; i++) {
            if (diceValues[i] == faceValue) score = score + faceValue;
        }
        return score;
    }

    public void setAces(Integer[] diceValues){
        aces = calculateUpperScores(diceValues, 1);
    }

    public void setTwos(Integer[] diceValues){
        twos = calculateUpperScores(diceValues, 2);
    }

    public void setThrees(Integer[] diceValues){
        threes = calculateUpperScores(diceValues, 3);
    }

    public void setFours(Integer[] diceValues){
        fours = calculateUpperScores(diceValues, 4);
    }

    public void setFives(Integer[] diceValues){
        fives = calculateUpperScores(diceValues, 5);
    }

    public void setSixes(Integer[] diceValues){
        sixes = calculateUpperScores(diceValues, 6);
    }

    private Integer countNumberOfAKind(Integer[] diceValues, Integer faceValue){
        Integer count = 0;
        for (int i = 0; i < 5; i++){
            if (diceValues[i] == faceValue) count = count + 1;
        }
        return count;
    }

    private Integer getSumOfDice(Integer[] diceValues){
        Integer sum = 0;
        for (int i=0; i <5; i++){
            sum = sum + diceValues[i];
        }
        return sum;
    }

    public void setThreeOfAKind(Integer[] diceValues) {
        for (int i=1; i <= 6; i++) {
            if (countNumberOfAKind(diceValues, i) >= 3) {
                threeOfAKind = getSumOfDice(diceValues);
                break;
            }
        } if (threeOfAKind==null) threeOfAKind = 0;
    }

    public void setFourOfAKind(Integer[] diceValues) {
        for (int i=1; i <= 6; i++) {
            if (countNumberOfAKind(diceValues, i) >= 4) {
                fourOfAKind = getSumOfDice(diceValues);
                break;
            }
        } if (fourOfAKind == null) fourOfAKind = 0;
    }

    public void setFullHouse(Integer[] diceValues) {
        // three of a kind and two of a kind
        boolean match3 = false;
        boolean match2 = false;
        for (int i=1; i<=6; i++) {
            if(countNumberOfAKind(diceValues, i) == 3) {
                match3 = true;
            }
            if (countNumberOfAKind(diceValues, i) == 2) {
                match2 = true;
            }
        }
        if (match2 && match3) fullHouse = 25;
        else fullHouse = 0;
    }

    public void setSmallStraight(Integer[] diceValues) {
        List<Integer> straight1 = List.of(1,2,3,4);
        List<Integer> straight2 = List.of(2,3,4,5);
        List<Integer> straight3 = List.of(3,4,5,6);

        Arrays.sort(diceValues);
        List<Integer> diceValuesList = List.of(diceValues[0],diceValues[1],diceValues[2],diceValues[3],diceValues[4]);
        if (diceValuesList.containsAll(straight1) || diceValuesList.containsAll(straight2) || diceValuesList.containsAll(straight3)) {
            smallStraight = 30;
        } else smallStraight = 0;
    }

    public void setLargeStraight(Integer[] diceValues) {
        List<Integer> straight1 = List.of(1,2,3,4,5);
        List<Integer> straight2 = List.of(2,3,4,5,6);
        Arrays.sort(diceValues);
        List<Integer> diceValuesList = List.of(diceValues[0],diceValues[1],diceValues[2],diceValues[3],diceValues[4]);
        if (diceValuesList.containsAll(straight1) || diceValuesList.containsAll(straight2)) {
            largeStraight = 40;
        } else largeStraight = 0;
    }

    public void setYahtzee(Integer[] diceValues) {
        if (countNumberOfAKind(diceValues, diceValues[0])==5) yahtzee = 50;
        else yahtzee = 0;
    }

    public void setChance(Integer[] diceValues) {
        chance = getSumOfDice(diceValues);
    }

    public void setYahtzeeBonuses(Integer[] diceValues) {
        if (yahtzeeBonuses==null) yahtzeeBonuses = 0;
        if (countNumberOfAKind(diceValues, diceValues[0])==5 && yahtzee==50) {
            yahtzeeBonuses = yahtzeeBonuses + 1;
        }
    }

    public void setScore(int section, Integer[] diceValues){
        switch (section) {
            case 1: setAces(diceValues); break;
            case 2: setTwos(diceValues); break;
            case 3: setThrees(diceValues); break;
            case 4: setFours(diceValues); break;
            case 5: setFives(diceValues); break;
            case 6: setSixes(diceValues); break;
            case 7: setThreeOfAKind(diceValues); break;
            case 8: setFourOfAKind(diceValues); break;
            case 9: setFullHouse(diceValues); break;
            case 10: setSmallStraight(diceValues); break;
            case 11: setLargeStraight(diceValues); break;
            case 12: setYahtzee(diceValues);break;
            case 13: setChance(diceValues); break;
        }
    }
}
