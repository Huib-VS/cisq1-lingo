package nl.hu.cisq1.lingo.domain;

import java.util.ArrayList;

public class Round {
    private int roundNumber;
    private int wordLength;
    private String word;
    private ArrayList<Feedback> feedbackHistory;

    public Round(int roundNumber, int wordLength, String word){// move word to API
        this.roundNumber = roundNumber;
        this.wordLength = wordLength;
        this.word = word;
    }

    public String getWord(){ // remove
        return word;
    }
}
