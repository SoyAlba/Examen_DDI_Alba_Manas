package com.examen.wordel.model;

import java.util.List;
import org.springframework.context.annotation.Profile;

@Profile("level1")
public class WordLevel1 extends AbstractWord {

    List<Word> words;
    public WordLevel1(Word word) {
        super(String.valueOf(word));
        int leng=3;
        int Attempts=20;
        word.setAttempts(Attempts);
        word.setLeng(leng);
    }

    static{
        Word.words.add(new Word("Pez"));
        Word.words.add(new Word("Pan"));
        Word.words.add(new Word("ana"));
        Word.words.add(new Word("ver"));

    }

}