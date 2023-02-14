package com.examen.wordel.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("level1")
@Component
public class WordLevel1 extends AbstractWord {

    public WordLevel1(Word word) {
        super(String.valueOf(word));
        int leng=3;
        int maxAttempts=20;
        word.setMaxAttempts(maxAttempts);
        word.setLeng(leng);
    }

    static{
        Word.words.add(new Word("Pez"));
        Word.words.add(new Word("Pan"));
        Word.words.add(new Word("ana"));
        Word.words.add(new Word("ver"));

    }

}