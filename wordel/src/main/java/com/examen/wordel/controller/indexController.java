package main.java.com.examen.wordel.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import main.java.com.examen.wordel.model.*;
@Controller("indexController")

public class indexController{

    private static Logger log = LogManager.getLogger(IndexController.class);

    @Autowired
    private Word word;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.getWord();
        return modelAndView;
    }

    @PostMapping("comprobarPalabra")
    public ModelAndView comprobarPalabra(@RequestParam("word") Word wordIndex) {
        ModelAndView modelAndView = new ModelAndView("index");
        if (wordIndex.isCorrect()) {
            modelAndView.addObject("message", "Correcto");
        } else {
            modelAndView.addObject("message", "Incorrecto");
        }
    }
    
}

    