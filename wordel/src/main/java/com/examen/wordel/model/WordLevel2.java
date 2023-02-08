package com.examen.wordel.model;

import java.util.ArrayList;
import java.util.List;

public class WordLevel2 extends AbstractWord {

    public WordLevel2(Word word) {
        super(String.valueOf(word));
        int leng=5;
        int Attempts=10;
        word.setAttempts(Attempts);
        word.setLeng(leng);

    }

    static{
        Word.words.add(new Word("perro"));
    }

}