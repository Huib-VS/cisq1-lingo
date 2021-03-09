package nl.hu.cisq1.lingo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feedback {
    private List<Mark> marks;

    public Feedback(List<Mark> marks){
        this.marks = marks;
    }

    public boolean isWordGuessed() {
        for (Mark mark : this.marks){
            if(!mark.equals(Mark.CORRECT)){
                return false;
            }
        }
        return true;
    }

    public List<Character> getHint(ArrayList<Feedback> feedbackHistory, String word, int length) throws Exception {
        List<Character> hint; // list naar Array?
        switch (length){
            case 5:
                hint = Arrays.asList('_','_','_','_','_');
                break;
            case 6:
                hint = Arrays.asList('_','_','_','_','_','_' );
                break;
            case 7:
                hint = Arrays.asList('_','_','_','_','_','_','_' );
                break;
            default:
                throw new Exception("length not supported");
        }
        int position = 0;
        for (Feedback feedback: feedbackHistory) {
            for (Mark mark: feedback.marks){
                if(mark.equals(Mark.CORRECT)) {
                    hint.set(position, word.charAt(position));
                }
                position++;
            }
        }
        return hint;
    }
}
