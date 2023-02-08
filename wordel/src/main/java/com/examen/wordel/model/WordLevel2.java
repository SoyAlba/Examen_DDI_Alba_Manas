package com.examen.wordel.model;



import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("level2")
public class WordLevel2 extends AbstractWord {

    public WordLevel2(Word word) {
        super(String.valueOf(word));
        int leng=5;
        int maxAttempts=10;
        word.setMaxAttempts(maxAttempts);
        word.setLeng(leng);

    }

    static{
        Word.words.add(new Word("perros"));
        Word.words.add(new Word("gatos"));
        Word.words.add(new Word("casas"));
        Word.words.add(new Word("camas"));
    }

}