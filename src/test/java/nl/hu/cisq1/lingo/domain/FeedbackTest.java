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
        String woord = "words";
        String guess = "words";

        //when
        Feedback feedback = new Feedback(woord, guess);
        System.out.println(feedback.getMarks());

        //then
        assertTrue(feedback.isWordGuessed());
    }

    @Test
    @DisplayName("word is not guessed if not all letters are correct")
    void woordIsNotGuessed(){
        //given
        String woord = "words";
        String guess = "doors";

        //when
        Feedback feedback = new Feedback(woord, guess);
        System.out.println(feedback.getMarks());

        //then
        assertFalse(feedback.isWordGuessed());
    }
}