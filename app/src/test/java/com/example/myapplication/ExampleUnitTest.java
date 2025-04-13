package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void given_Empty_String_When_CountWords_Then_ReturnZero() {
        String givenString = "";
        int expectedResult = 0;
        int actualResult = TextAnalyzer.countWords(givenString);
        assertEquals(expectedResult, actualResult);

}

    @Test
    public void given_TwoWords_String_When_CountWords_Then_ReturnTwo() {
        String givenString = "Labas rytas";

        int expectedResult = 2;
        int actualResult = TextAnalyzer.countWords(givenString);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void given_Empty_String_When_CountChars_Then_ReturnZero() {
        String givenString = "";
        int expectedResult = 0;
        int actualResult = TextAnalyzer.countCharacters(givenString);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void given_Null_When_CountWords_Then_ReturnZero() {
        String givenString = null;
        int expectedResult = 0;
        int actualResult = TextAnalyzer.countWords(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given_Null_When_CountCharacters_Then_ReturnZero() {
        String givenString = null;
        int expectedResult = 0;
        int actualResult = TextAnalyzer.countCharacters(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}