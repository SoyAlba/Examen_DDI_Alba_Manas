package main.java.com.examen.wordel.model;
public class AbstractWord implements Worl{

    private String word;
    private List<Letter> letters = new ArrayList<Letter>();

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

    public void addLetter(Letter letter) {
        letters.add(letter);
    }

    public boolean isFull() {
        return letters.size() == word.length();
    }

    public int spaceAvalaible() {
        return word.length() - letters.size();
    }

    public void addItem(Letter letter) {
        letters.add(letter);
    }

    public boolean isCorrect() {
        String word = "";
        for (Letter letter : letters) {
            word += letter.getLetter();
        }
        return this.word.equals(word);
    }

}
