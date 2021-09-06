package com.junit5example.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WordCounterParameterizedTest {
    WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @ValueSource(strings = { "I am Samit", "The world's round" })
    public void countWords(String sentence) {
        assertEquals(3, wordCounter.wordCount(sentence));
    }
}
