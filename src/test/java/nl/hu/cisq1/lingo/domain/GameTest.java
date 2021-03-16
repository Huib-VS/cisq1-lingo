package nl.hu.cisq1.lingo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game testGame = new Game();

    @Test
    @DisplayName("Start new round with 5 letters")
    void StartRoundWith5Letters(){
        testGame.startNewRound("words");
        testGame.getCurrentRound().getHint();
        String word = testGame.getCurrentRound().getWord();
        assertEquals(word, "words");
    }

    @Test
    @DisplayName("Start new round with 6 letters")
    void StartRoundWith6Letters(){
        testGame.startNewRound("hadden");
        testGame.getCurrentRound().getHint();
        String word = testGame.getCurrentRound().getWord();
        assertEquals(word, "hadden");
    }

    @Test
    @DisplayName("Start new round with 7 letters")
    void StartRoundWith7Letters(){
        testGame.startNewRound("kaaskop");
        testGame.getCurrentRound().getHint();
        String word = testGame.getCurrentRound().getWord();
        assertEquals(word, "kaaskop");
    }

    @Test
    @DisplayName("Test history of previous rounds")
    void HistoryTest(){
        testGame.startNewRound("words");
        testGame.startNewRound("hadden");
        testGame.startNewRound("kaaskop");
        System.out.println(testGame.getRoundHistory());
        assertEquals(testGame.getRoundHistory().size(), 2);
    }

    @Test
    @DisplayName("progress for new game")
    void TestProgressNewGame(){
        Progress progress = testGame.getProgress();
        System.out.println("round: " + progress.getRoundNumber()+ " - word length: " + progress.getCurrentWordLength());
        assertTrue(progress.getRoundNumber() == 1 && progress.getCurrentWordLength() == 5);
    }

    @Test
    @DisplayName("progress round increment")
    void TestRoundIncrement(){
        Progress progress = testGame.getProgress();
        progress.incrementRound();
        System.out.println("round: " + progress.getRoundNumber()+ " - word length: " + progress.getCurrentWordLength());
        assertTrue(progress.getRoundNumber() == 2 && progress.getCurrentWordLength() == 6);
    }

    @Test
    @DisplayName("progress round increment loop")
    void TestRoundIncrementLoop(){
        Progress progress = testGame.getProgress();
        progress.incrementRound();
        progress.incrementRound();
        progress.incrementRound();
        System.out.println("round: " + progress.getRoundNumber()+ " - word length: " + progress.getCurrentWordLength());
        assertTrue(progress.getRoundNumber() == 4 && progress.getCurrentWordLength() == 5);
    }
}