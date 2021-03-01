package nl.hu.cisq1.lingo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackTest {
    @Test
    @DisplayName("word is guessed is all letters are correct")
    void woordIsGuessed(){
        //given


        //when
        Feedback feedback = new Feedback(List.of(Mark.CORRECT, Mark.CORRECT, Mark.CORRECT, Mark.CORRECT, Mark.CORRECT));

        //then
        assertTrue(feedback.isWordGuessed());
    }

    @Test
    @DisplayName("word is not guessed if not all letters are correct")
    void woordIsNotGuessed(){
        //given


        //when
        Feedback feedback = new Feedback(List.of(Mark.CORRECT, Mark.ABSENT, Mark.CORRECT, Mark.CORRECT, Mark.CORRECT));

        //then
        assertFalse(feedback.isWordGuessed());
    }
}