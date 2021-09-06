package com.junit5example.learning;

public class WordCounter {
    public int wordCount(String sentence) {
        return sentence.split(" ").length;
    }
}
