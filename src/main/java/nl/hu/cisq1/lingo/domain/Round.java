package nl.hu.cisq1.lingo.domain;

import java.util.ArrayList;

public class Round {
    private int roundNumber;
    private int wordLength;
    private String word;
    private char[] hint;
    private ArrayList<Feedback> feedbackHistory;

    public Round(int roundNumber, int wordLength, String word){// move word to API
        this.roundNumber = roundNumber;
        this.wordLength = wordLength;
        this.word = word;
        switch (wordLength){
            case 5:
                this.hint = new char[]{word.charAt(0), '_','_','_','_'};
                break;
            case 6:
                this.hint = new char[]{word.charAt(0), '_','_','_','_','_'};
                break;
            case 7:
                this.hint = new char[]{word.charAt(0), '_','_','_','_','_','_'};
                break;
        }
    }

    public String getWord(){ // remove
        return word;
    }

    public char[] getHint() {
        return hint;
    }
}
