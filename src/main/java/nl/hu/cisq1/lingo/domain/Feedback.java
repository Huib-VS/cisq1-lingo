package nl.hu.cisq1.lingo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feedback {
    private List<Mark> marks;
    private String word;

    public Feedback(String word, String guess){
        this.word = word;
        List<Mark> marks = new ArrayList<Mark>();
        StringBuilder alterdGuess = new StringBuilder();
        StringBuilder alterdWord = new StringBuilder();

        int index = 0;
        for (Character letter: guess.toCharArray()) {
            if (letter == this.word.charAt(index)) {
                marks.add(Mark.CORRECT);

            } else {
                marks.add(Mark.TEMP);
                alterdWord.append(this.word.charAt(index));
                alterdGuess.append(letter);
            }
            index++;
        }

        index = 0;
        for (Character letter: alterdGuess.toString().toCharArray()) {
            if(alterdWord.toString().contains(letter.toString())){
                marks.set(marks.indexOf(Mark.TEMP), Mark.PRESENT);
                alterdWord = new StringBuilder(alterdWord.toString().replaceFirst(letter.toString(), ""));
            }
            else{
                marks.set(marks.indexOf(Mark.TEMP), Mark.ABSENT);
            }
            index++;
        }
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

    public List<Mark> getMarks() {
        return marks;
    }

    //    public List<Character> getHint(ArrayList<Feedback> feedbackHistory, String word, int length) throws Exception {
//        List<Character> hint; // list naar Array?
//        switch (length){
//            case 5:
//                hint = Arrays.asList('_','_','_','_','_');
//                break;
//            case 6:
//                hint = Arrays.asList('_','_','_','_','_','_' );
//                break;
//            case 7:
//                hint = Arrays.asList('_','_','_','_','_','_','_' );
//                break;
//            default:
//                throw new Exception("length not supported");
//        }
//        int position = 0;
//        for (Feedback feedback: feedbackHistory) {
//            for (Mark mark: feedback.marks){
//                if(mark.equals(Mark.CORRECT)) {
//                    hint.set(position, word.charAt(position));
//                }
//                position++;
//            }
//        }
//        return hint;
//    }
}
