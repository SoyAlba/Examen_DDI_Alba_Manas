package main.java.com.examen.wordel.model;

public class WordLevel3 extends AbstractWord {

    public WordLevel3() {
        leng=8;
        Attempts=6;
    }
    static{
        Word.add(new WordLevel1("amapolas"));
        Word.add(new WordLevel1("pelicano"));
        Word.add(new WordLevel1("barberos"));
        Word.add(new WordLevel1("cascabel"));
    }

}
