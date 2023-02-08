package com.examen.wordel.model;

public class Letter {
    
        private String letter;

        public Letter() {
            super();
        }
    
        public Letter(String letter) {
            this.letter = letter;
        }
    
        public String getLetter() {
            return letter;
        }
    
        public void setLetter(String letter) {
            this.letter = letter;
        }

        public boolean isCorrect() {
            return letter.equals(letter.toUpperCase());
        }



}
