package nl.hu.cisq1.lingo.domain;

public class Progress {
    private int roundNumber;
    private int currentWordLength;
    private int score;

    Progress(){
        roundNumber = 1;
        currentWordLength = 5;
        score = 0;
    }

    public void incrementRound(){
        roundNumber ++;
        if(currentWordLength == 7){
            currentWordLength = 5;
        }
        else{
            currentWordLength ++;
        }
    }

    public int getCurrentWordLength() {
        return currentWordLength;
    }

    public int getRoundNumber() {
        return roundNumber;
    }
}
