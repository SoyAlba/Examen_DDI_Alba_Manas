package com.examen.wordel.model;

import java.util.ArrayList;
import java.util.List;
public interface IWord {

    public static List<Word> words = new ArrayList<Word>();

    public List<Letter> getLetters();

    public void setLetters(List<Letter> letters);

    public String getWord();

    public void setWord(String word);

    public boolean isCorrect();

    public int getAttempts();

    public void setAttempts(int attempts);

    public int getLeng();

    public void setLeng(int leng);

    public int getLe();

    public void setLe(int le);

    public boolean isCorrect(String word, int attempts, int leng);

    public int addword(String word);
}