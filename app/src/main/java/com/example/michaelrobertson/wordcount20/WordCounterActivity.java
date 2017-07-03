package com.example.michaelrobertson.wordcount20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    WordCounter wordCounter;
    EditText wordCountEditText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        wordCountEditText = (EditText)findViewById(R.id.inputText);
        answerText = (TextView)findViewById(R.id.answer_text);
        countButton = (Button)findViewById(R.id.countButton);
    }

    public void onButtonClick(View button) {
        String input = wordCountEditText.getText().toString();

        wordCounter = new WordCounter(input);
//        answerText.setText(Integer.toString(wordCounter.wordCount()));
        answerText.setText(wordCounter.wordCountAsString());

    }
}
