/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StringCounterModel;
import View.StringCounterView;
import java.util.Map;

/**
 *
 * @author PC
 */
public class StringCounterController {
    private StringCounterModel model;
    private StringCounterView view;

    public StringCounterController(StringCounterModel model, StringCounterView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        String input = view.getInput();
        model.count(input);
        int letterCount = model.getLetterCount();
        int characterCount = model.getCharacterCount();
        Map<String, Integer> characterCounts = model.getCharacterCounts();
        Map<String, Integer> wordCounts = model.getWordCounts();
        view.displayResult(letterCount, characterCount, characterCounts, wordCounts);
    }

}