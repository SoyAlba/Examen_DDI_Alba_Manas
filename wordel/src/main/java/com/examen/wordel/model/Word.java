package com.examen.wordel.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Word {

    public static List<Word> words = new ArrayList<Word>();
    private List<Letter> letters = new ArrayList<Letter>();
    private String word;
    private int attempts;
    private int leng;
    private int le;
    private int maxAttempts;

    @Autowired
    public Word() {
        super();
    }

    public Word(String word) {
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

    public boolean isCorrect(String word, int attempts, int leng) {
        return false;
    }

    public int addword(String word) {
        words.add(new Word(word));
        return words.size();
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }
}