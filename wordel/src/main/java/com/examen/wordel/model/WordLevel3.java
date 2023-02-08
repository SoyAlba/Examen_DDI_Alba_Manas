package com.examen.wordel.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("level3")
@Component
public class WordLevel3 extends AbstractWord {

    public WordLevel3(Word word) {
        super(String.valueOf(word));
        int leng=8;
        int Attempts=6;
        word.setAttempts(Attempts);
        word.setLeng(leng);
    }
    static{
        Word.words.add(new Word("amapolas"));
        Word.words.add(new Word("pelicano"));
        Word.words.add(new Word("barberos"));
        Word.words.add(new Word("cascabel"));
    }

}
