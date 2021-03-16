package nl.hu.cisq1.lingo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Test
    @DisplayName("test initial hint")
    void TestRoundSetupHint(){
        Round testRound = new Round(1, 7, "Broment");
        char[] expextedHint = new char[]{'B', '_','_','_','_','_','_'};
        char[] hint = testRound.getHint();
        System.out.println(hint);
        System.out.println(expextedHint);
        assertTrue(Arrays.equals(hint, expextedHint));
    }
}