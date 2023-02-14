package com.examen.wordel.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examen.wordel.model.*;
@Controller
public class IndexController{
    Logger log = LogManager.getLogger(IndexController.class);
    @Autowired
    public Word word;

    public List<Word> wordsAttemsList = new ArrayList<Word>();

    @Autowired
    public IndexController(Word word) {
        this.word = word;
    }
    @GetMapping("/")
    public ModelAndView goToIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
        int index = (int) (Math.random() * 4);
        word = Word.words.get(index);
        modelAndView.addObject("word", word);
        return modelAndView;
    }

    @PostMapping("comprobarPalabra")
    public ModelAndView comprobarPalabra(@RequestParam("wordIndex") Word wordIndex) {
        ModelAndView modelAndView = new ModelAndView("index");
        if (wordIndex.isCorrect(wordIndex.getWord(), wordIndex.getAttempts(), wordIndex.getLeng())) {
            modelAndView.addObject("wordIndex", wordIndex);
            modelAndView.addObject("message", "Correcto");
            wordsAttemsList.add(wordIndex);
            log=LogManager.getLogger(IndexController.class);
        } else {
            modelAndView.addObject("wordIndex", wordIndex);
            modelAndView.addObject("message", "Incorrecto");
            wordIndex.setAttempts(wordIndex.getAttempts() + 1);
            if (wordIndex.getAttempts() == word.getMaxAttempts()) {
                modelAndView.addObject("message", "Has perdido");
            }
        }
        return modelAndView;
    }


    @PostMapping("switchWord")
    public ModelAndView switchWord() {
        ModelAndView modelAndView = new ModelAndView("index");
        int index = (int) (Math.random() * 4);
        word = Word.words.get(index);
        modelAndView.addObject("word", word);
        log=LogManager.getLogger(IndexController.class);
        return modelAndView;
    }

    @PostMapping("intentos")
    public ModelAndView intentos(@RequestParam("word") Word wordIndex) {
        ModelAndView modelAndView = new ModelAndView("index");
        wordIndex.setAttempts(wordIndex.getAttempts() + 1);
        modelAndView.addObject("word", wordIndex);
        return modelAndView;
    }

    @PostMapping("palabrasIntentos")
    public ModelAndView palabrasIntentos(@RequestParam("word") Word wordIndex) {
        for (int i = 0; i < wordsAttemsList.size(); i++) {
            if (wordsAttemsList.get(i).getWord().equals(wordIndex.getWord())) {
                wordsAttemsList.get(i).setAttempts(wordIndex.getAttempts());
            } else {
                wordsAttemsList.add(wordIndex);
            }
        }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("wordsAttemsList", wordsAttemsList);
        return modelAndView;
    }

    @PostMapping("reset")
    public ModelAndView reset() {
        ModelAndView modelAndView = new ModelAndView("index");
        int index = (int) (Math.random() * 4);
        word = Word.words.get(index);
        modelAndView.addObject("word", word);
        return modelAndView;
    }

    @PostMapping("resetAttempts")
    public ModelAndView resetAttempts(@RequestParam("word") Word wordIndex) {
        ModelAndView modelAndView = new ModelAndView("index");
        wordIndex.setAttempts(0);
        modelAndView.addObject("word", wordIndex);
        return modelAndView;
    }

}

    