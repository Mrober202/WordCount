package com.example.michaelrobertson.wordcount20;

/**
 * Created by michaelrobertson on 03/07/2017.
 */

public class WordCounter {
    String string;

    public WordCounter(String string) {
        this.string = string;
    }

    public String wordCount() {
//        take in a string
//        split it into separate words
//        count the words
//        return number of words counted.

        int counter = string.split(" ").length;

        return "" + counter;
    }

//    public String wordCountAsString(int wordCount) {
//        int count = string;
//        return "" + counter;
//    }

}