package com.examen.wordel.model;

import java.util.ArrayList;
import java.util.List;
 
public abstract class AbstractWord implements IWord {

    private List<Letter> letters = new ArrayList<Letter>();
    private String word;
    private int attempts;
    private int leng;
    private int le;


    public AbstractWord() {
        super();
    }

    public AbstractWord(String word) {
        super();
        this.word = word;
        this.leng = word.length();
        for (int i = 0; i < word.length(); i++) {
            letters.add(new Letter(word.substring(i, i + 1)));
        }
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getLeng() {
        return leng;
    }

    public void setLeng(int leng) {
        this.leng = leng;
    }

    public int getLe() {
        return le;
    }

    public void setLe(int le) {
        this.le = le;
    }
    public boolean isCorrect() {
        for (Letter letter : letters) {
            if (!letter.isCorrect()) {
                return false;
            }
        }
        return true;
    }

    public boolean isCorrect(String word, int attempts, int leng) {
        if (word.equals(this.word) && attempts == leng) {
            return true;
        }
        return false;
    }

    public int addword(String word) {

        Word.words.add(new Word(word));
        return Word.words.size();

    }


}
