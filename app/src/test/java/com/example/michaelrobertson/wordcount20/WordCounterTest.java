package com.example.michaelrobertson.wordcount20;

import com.example.michaelrobertson.wordcount20.WordCounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 03/07/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("everyone is happy on friday");
    }

    @Test
    public void testWordCount() throws Exception {
        assertEquals(5, wordCounter.wordCount());
    }
}