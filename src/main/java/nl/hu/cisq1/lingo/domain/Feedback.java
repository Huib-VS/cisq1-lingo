package nl.hu.cisq1.lingo.domain;

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
}
