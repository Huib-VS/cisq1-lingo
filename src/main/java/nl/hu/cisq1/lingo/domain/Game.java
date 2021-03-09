package nl.hu.cisq1.lingo.domain;

import java.util.ArrayList;

public class Game {
    private Round currentRound;
    private ArrayList<Round> roundHistory;
    private GameStatus gameStatus;
    private Progress progress;

    public Game(){
        this.progress = new Progress();
    }

//    public void startInitialRound(String word){
//        currentRound = new Round(progress.getRoundNumber(), progress.getCurrentWordLength());
//        System.out.println(currentRound.getWord());
//        this.gameStatus = GameStatus.PLAYING;
//    }


    public void startNewRound(String word){ // make sure word length is right
        if (currentRound != null) {
            roundHistory.add(currentRound);
            progress.incrementRound();
        }

        currentRound = new Round(progress.getRoundNumber(), progress.getCurrentWordLength(), word);
        System.out.println(currentRound.getWord());
        this.gameStatus = GameStatus.PLAYING;
    }
}
