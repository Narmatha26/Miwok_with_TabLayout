package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("әpә", "Father" ));
        words.add(new Word( "әṭa","Mother"));
        words.add(new Word("angsi","Son"));
        words.add(new Word("tune","Daughter"));
        words.add(new Word("taachi","Older brother"));
        words.add(new Word("chalitti","Younger brother"));
        words.add(new Word("teṭe","Older sister"));
        words.add(new Word("kolliti","Younger sister"));
        words.add(new Word("ama","Grand mother"));
        words.add(new Word("paapa","Grand father"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
