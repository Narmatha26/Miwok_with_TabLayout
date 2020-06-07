package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("weṭeṭṭi", "Red" ));
        words.add(new Word( "chokokki","Green"));
        words.add(new Word("ṭakaakki","Brown"));
        words.add(new Word("ṭopoppi","Gray"));
        words.add(new Word("kululli","Black"));
        words.add(new Word("kelelli","White"));
        words.add(new Word("ṭopiisә","Dusty yellow"));
        words.add(new Word("chiwiiṭә","Mustard yellow"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
