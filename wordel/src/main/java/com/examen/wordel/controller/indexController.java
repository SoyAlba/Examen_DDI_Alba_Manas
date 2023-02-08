package com.examen.wordel.controller;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examen.wordel.model.*;
@Controller("indexController")

public class indexController{
    
    @Autowired
    private Word word;
    private List<Word> wordsAttemsList = new ArrayList<Word>();
    private int attempts;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        int index = (int) (Math.random() * 4);
        word = Word.words.get(index);
        modelAndView.addObject("word", word);
        return modelAndView;
    }

    @PostMapping("comprobarPalabra")
    public ModelAndView comprobarPalabra(@RequestParam("word") Word wordIndex) {
        ModelAndView modelAndView = new ModelAndView("index");
        if (wordIndex.isCorrect(wordIndex.getWord(), wordIndex.getAttempts(), wordIndex.getLeng())) {
            modelAndView.addObject("word", wordIndex);
            modelAndView.addObject("message", "Correcto");
        } else {
            modelAndView.addObject("word", wordIndex);
            modelAndView.addObject("message", "Incorrecto");
        }
        return modelAndView;
    }

    @PostMapping("switchWord")
    public ModelAndView switchWord() {
        ModelAndView modelAndView = new ModelAndView("index");
        int index = (int) (Math.random() * 4);
        word = Word.words.get(index);
        modelAndView.addObject("word", word);
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

    